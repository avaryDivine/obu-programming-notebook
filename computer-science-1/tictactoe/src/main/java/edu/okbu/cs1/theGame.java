package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class theGame {
    int numGames;
    String summaryString;
    FileOutputStream outFile;
    PrintWriter outWriter;
    player player1;
    player player2;
    int[] player1choice;
    String player1choiceChar;
    int [] player2choice;
    String player2choiceChar;
    GameBoard playBoard;
    String winner;
    Scanner fileScanner;
    FileInputStream inFile;


    public theGame() {
        playBoard = new GameBoard();
        player1 = new player(playBoard);
        player2 = new player(playBoard);
    }

    public void initialize() throws FileNotFoundException {
        outFile = new FileOutputStream("tictactoe.out");
        outWriter = new PrintWriter(outFile);
        
        inFile = new FileInputStream("numGames.txt");
        fileScanner = new Scanner(inFile);
    }

    public void setPlayer1(player player) {
        player1 = player;
    }

    public void setPlayer2(player player) {
        player2 = player;
    }


    public void play() throws IOException {
        numGames = fileScanner.nextInt();
        
        for (int i = 1; i < numGames + 1; ++i) {
           
            outWriter.println("Game number " + i + ":");
            outWriter.println();

            System.out.println("Game number " + i + ":");
            System.out.println();
            winner = null;

            while (winner == null) {

                System.out.println("Player 1: ");
                player1choice = player1.choice();
                player1choiceChar = player1.xo();
                playBoard.board[player1choice[0]][player1choice[1]] = player1choiceChar;
                outWriter.println("Player1 chose " + player1choiceChar + " at " + player1choice[0] + player1choice[1]);
                
                winner = playBoard.winner();
                if (winner != null) {
                    break;
                }

                System.out.println("Player 2: ");
                player2choice = player2.choice();
                player2choiceChar = player2.xo();
                playBoard.board[player2choice[0]][player2choice[1]] = player2choiceChar;
                outWriter.println("Player2 chose " + player2choiceChar + " at " + player2choice[0] + player2choice[1]);

                playBoard.display();
                System.out.println();

                winner = playBoard.winner();
            }
            if (player1choiceChar.equals(winner)) {
                player1.addWin();
                outWriter.println("Winner of game " + i + ": Player1");
                outWriter.println();
                System.out.println("Winner of game " + i + ": Player1");
                System.out.println();
            }
            else if (player2choiceChar.equals(winner)) {
                player2.addWin();
                outWriter.println("Winner of game " + i + ": Player2");
                outWriter.println();
                System.out.println("Winner of game " + i + ": Player2");
                System.out.println();
            }
            playBoard.resetBoard();
        }
        
    }

    public String summary() throws IOException {
        summaryString = "After " + numGames + " games:\n";
        summaryString += "Player 1 won: " + player1.getWins() + " times\n"; 
        summaryString += "Player 2 won: " + player2.getWins() + " times\n";
        System.out.println(summaryString);
        outWriter.println(summaryString);
        outWriter.close();
        return summaryString;

    }
     
    public static void main(String[] args) throws IOException {
        theGame game = new theGame();
        game.initialize();
        game.play();
        game.summary();
    }
}
