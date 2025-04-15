package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class gameBoard {
    FileInputStream inFile;
    Scanner fileScanner;
    String boardString;
    String[][] mainBoard = new String[5][5];
    String[][] hiddenBoard = new String[5][5];
    int i;
    int j;

    public gameBoard() {

    }

    public void initialize() throws FileNotFoundException {
        inFile = new FileInputStream("shipPos.txt");
        fileScanner = new Scanner(inFile);

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

    public static void main(String[] args) throws FileNotFoundException {
        gameBoard playBoard = new gameBoard();
        playBoard.initialize();
        playBoard.display();
    }
}



