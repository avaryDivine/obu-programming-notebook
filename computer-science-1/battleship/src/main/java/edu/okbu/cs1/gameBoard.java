package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class gameBoard {
    FileInputStream inFile;
    Scanner fileScanner;
    String boardString;
    FileOutputStream outFile;
    PrintWriter outWriter;
    String[][] mainBoard;
    String[][] hiddenBoard;
    int i;
    int j;
    String playString = "";
    String ship = "";
    

    public gameBoard() throws FileNotFoundException {
        initialize();
    }

    public void initialize() throws FileNotFoundException {
        inFile = new FileInputStream("shipPos.txt");
        fileScanner = new Scanner(inFile);

        outFile = new FileOutputStream("battleShip.out");
        outWriter = new PrintWriter(outFile);
        
        int boardLength = fileScanner.nextInt();
        int boardWidth = fileScanner.nextInt();

        hiddenBoard = new String[boardLength][boardWidth];
        mainBoard = new String[boardLength][boardWidth];

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

    

    public String hiddenDisplay() {

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

    public void mainDisplay() {

        boardString = "";

        for (i = 0; i < mainBoard.length; ++i) {
            for (j = 0; j < mainBoard[i].length; ++j) {
                if (mainBoard[i][j] == null) {
                    boardString = boardString + "_ ";
                } else {
                    boardString = boardString + mainBoard[i][j] + " ";
                }
            }
            boardString = boardString + "\n";
        }

        System.out.print(boardString);
        System.out.println();
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

        if (hiddenBoard[row][column] == null) {
            playString = "Miss!";
            mainBoard[row][column] = "M";
        }
        else {
            ship = hiddenBoard[row][column];
            playString = "Hit!";
            mainBoard[row][column] = "H";

            if (shipSunk(ship)) {
                if (ship.equals("b")) {
                    playString = playString + "\n" +  "You sunk the Battleship!";
                }
                else if (ship.equals("s")) {
                    playString = playString + "\n" +  "You sunk the Submarine!";
                }
                else if (ship.equals("d")) {
                    playString = playString + "\n" +  "You sunk the Destroyer!";
                }

            }
        }
        
        return playString;
    }


    public boolean shipSunk(String ship) {
        for (int i = 0; i < hiddenBoard.length; i++) {
            for (int j = 0; j < hiddenBoard[i].length; j++) {
                if (ship.equals(hiddenBoard[i][j])) {
                    if (mainBoard[i][j] == null || mainBoard[i][j].equals("M")) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean winner() {
        for (i = 0; i < hiddenBoard.length; ++i) {
            for (j = 0; j < hiddenBoard[i].length; ++j) {
                if (hiddenBoard[i][j] != null && (mainBoard[i][j] == null || !mainBoard[i][j].equals("H"))) {
                    return false;
                }
            }
            
        }
        return true;
    }

    public void resetBoard() {
        for (int i = 0; i < mainBoard.length; ++i){
            for (int j = 0; j < mainBoard[i].length; ++j) {
                mainBoard[i][j] = null;
            }
        }
    }

    //public static void main(String[] args) throws FileNotFoundException {
        //gameBoard playBoard = new gameBoard();
        //playBoard.initialize();
        //playBoard.hiddenDisplay();
        //playBoard.mainDisplay();
        
    //}
}



