package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Battleship {
    int numGames;
    int numShots;
    gameBoard mainBoard;
    gameBoard hiddenBoard;
    player thePlayer;
    int[] thePlayerChoice;
    Scanner fileScanner;
    FileInputStream inFile;
    FileOutputStream outFile;
    PrintWriter outWriter;
    Boolean winner;
    String summaryString;
    String playString = "";

    public Battleship() throws FileNotFoundException {
        mainBoard = new gameBoard();
        thePlayer = new player(mainBoard);
    }

    public void initialize() throws FileNotFoundException {

        outFile = new FileOutputStream("battleShip.out");
        outWriter = new PrintWriter(outFile);
        
        inFile = new FileInputStream("numShots.txt");
        fileScanner = new Scanner(inFile);
    }


    public void play() throws IOException {
        numGames = fileScanner.nextInt();
        numShots = fileScanner.nextInt();

        for (int j = 1; j < numGames + 1; ++j) {
            outWriter.println("Game number " + j + ":");
            outWriter.println();

            System.out.println("Game number " + j + ":");
            System.out.println();

            for (int i = 1; i < numShots + 1; ++i) {

                outWriter.println("Shot number " + i + ":");
                System.out.println("Shot number " + i + ":");

                thePlayerChoice = thePlayer.choice(playString);
                outWriter.println("You chose " + thePlayerChoice[0] + thePlayerChoice[1]);
                String result = mainBoard.play(thePlayerChoice);
                System.out.println(result);
                outWriter.println(result);
                if (result.equals("Hit!")) {
                    playString = "H";
                    
                }
                else if (mainBoard.shipSunk(mainBoard.ship)) {
                    playString = "S";
                }
                else if (result.equals("Miss!")) {
                    playString = "M";
                }

                System.out.println();
                outWriter.println();

                winner = mainBoard.winner();

                mainBoard.mainDisplay();
                
                if (winner) {
                    thePlayer.addWin();
                    System.out.println("You won the game!");
                    System.out.println();
                    outWriter.println("You won the game!");
                    outWriter.println();
                    break;
                }

            }

            if (!winner) {
                System.out.println("You ran out of shots!");
                System.out.println();
                outWriter.println("You ran out of shots!");
                outWriter.println();
            }

            mainBoard.resetBoard();
            
        }
        summary();
    }

    public String summary() throws IOException {
        summaryString = "After " + numGames + " games:\n";
        summaryString += "You won: " + thePlayer.getWins() + " times\n";
        summaryString += "The board looked like this: \n";
        System.out.println(summaryString);
        outWriter.println(summaryString);
        outWriter.println(mainBoard.hiddenDisplay());
        System.out.println(mainBoard.hiddenDisplay());
        outWriter.close();
        return summaryString;
    }

    //public static void main(String[] args) throws IOException {
        //Battleship game = new Battleship();
        //game.initialize();
        //game.play();
        
    //}
}
