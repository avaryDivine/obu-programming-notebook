package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gameBoard {
    FileInputStream inFile;
    Scanner fileScanner;
    String boardString;
    String[][] mainBoard;
    String[][] hiddenBoard;
    int i;
    int j;
    String playString = "";

    public gameBoard() {

    }

    public void initialize() throws FileNotFoundException {
        inFile = new FileInputStream("shipPos.txt");
        fileScanner = new Scanner(inFile);
        
        int boardLength = fileScanner.nextInt();
        int boardWidth = fileScanner.nextInt();

        hiddenBoard = new String[boardLength][boardWidth];

        for (i = 0; i < hiddenBoard.length; ++i) {
            for (j = 0; j < hiddenBoard[i].length; ++j) {
                if (fileScanner.hasNext()) {
                    String inString = fileScanner.next();
                    if (inString.equals("_")) {
                        hiddenBoard[i][j] = null;
                    } 
                    else {
                        hiddenBoard[i][j] = inString;
                    }
                }
            }
        }

        for (i = 0; i < mainBoard.length; ++i) {
            for (j = 0; j < mainBoard[i].length; ++j) {
                mainBoard[i][j] = null;
            }
        }

    }
    
    public String toString() {
        boardString = "";

        for (i = 0; i < hiddenBoard.length; ++i) {
            for (j = 0; j < hiddenBoard[i].length; ++j) {
                if (hiddenBoard[i][j] == null) {
                    boardString = boardString + "_ ";
                } else {
                    boardString = boardString + hiddenBoard[i][j] + " ";
                }
            }
            boardString = boardString + "\n";
        }

        return boardString;
    }

    public void display() {
        System.out.print(toString());
    }

    public Boolean validMove(int[] move) {
        int row = move[0];
        int column = move[1];
        
        if (mainBoard[row][column] == null) {
            return true;
        }

        return false;
    }

    public String play(int[] move) {
        int row = move[0];
        int column = move[1];

        if (hiddenBoard[row][column].equals("_")) {
            playString = "Miss";
        }
        else {
            playString = "Hit";
        }
        
        return playString;
    }

    public static void main(String[] args) throws FileNotFoundException {
        gameBoard playBoard = new gameBoard();
        playBoard.initialize();
        playBoard.display();
    }
}



