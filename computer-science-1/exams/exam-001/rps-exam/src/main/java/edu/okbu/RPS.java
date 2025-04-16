package edu.okbu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RPS {
    Scanner fileScanner;
    FileInputStream rpsFile;
    FileOutputStream outFile;
    PrintWriter outValue;
    Player player1;
    Player player2;
    int numGames;
    Choices player1Choice;
    Choices player2Choice;

    public RPS() {
        
    }

    public void initialize(String fileName) throws IOException {
        rpsFile = new FileInputStream(fileName);
        fileScanner = new Scanner(rpsFile);

        String player1Name = fileScanner.nextLine();
        String player2Name = fileScanner.nextLine();
        numGames = fileScanner.nextInt();

        player1 = new Player(player1Name);
        player2 = new Player(player2Name);
        
        outFile = new FileOutputStream("rps.out");
        outValue = new PrintWriter(outFile);

    }

    public void setPlayer1(Player player) {
        player1 = player;
    }

    public void setPlayer2(Player player) {
        player2 = player;
    }

    public void play() throws IOException {
        player1.resetWins();
        player2.resetWins();

        for (int i = 1; i <= numGames; ++i) {
            outValue.println("Game number " + i + ":");
            outValue.println();
            System.out.println("Game number " + i + ":");
            System.out.println();

            player1Choice = player1.getChoice();
            player2Choice = player2.getChoice();
            
            outValue.println("Player1 chose " + player1Choice);
            System.out.println("Player1 chose " + player1Choice);
            outValue.println("Player2 chose " + player2Choice);
            System.out.println("Player2 chose " + player2Choice);

            determineWinner();
        }

        outValue.println(player1.toString());
        System.out.println(player1.toString());
        outValue.println();
        System.out.println();

        outValue.println(player2.toString());
        System.out.println(player2.toString());
        outValue.println();
        System.out.println();

        fileScanner.close();
        rpsFile.close();

        outValue.flush();
        outValue.close();
        outFile.close();
    }

    public Player determineWinner() {
        Player winner;
        winner = null;

        if ((player1Choice == Choices.ROCK) && (player2Choice == Choices.PAPER)) {
            player2.addWin();
            winner = player2;

            outValue.println("Player2 won!");
            System.out.println("Player2 won!");
            outValue.println();
            System.out.println();
        }
        else if ((player1Choice == Choices.ROCK) && (player2Choice == Choices.SCISSORS)) {
            player1.addWin();
            winner = player1;

            outValue.println("Player1 won!");
            System.out.println("Player1 won!");
            outValue.println();
            System.out.println();
        }
        else if ((player1Choice == Choices.PAPER) && (player2Choice == Choices.ROCK)) {
            player1.addWin();
            winner = player1;

            outValue.println("Player1 won!");
            System.out.println("Player1 won!");
            outValue.println();
            System.out.println();
        }
        else if ((player1Choice == Choices.PAPER) && (player2Choice == Choices.SCISSORS)) {
            player2.addWin();
            winner = player2;

            outValue.println("Player2 won!");
            System.out.println("Player2 won!");
            outValue.println();
            System.out.println();
        }
        else if ((player1Choice == Choices.SCISSORS) && (player2Choice == Choices.ROCK)) {
            player2.addWin();
            winner = player2;

            outValue.println("Player2 won!");
            System.out.println("Player2 won!");
            outValue.println();
            System.out.println();
        }
        else if ((player1Choice == Choices.SCISSORS) && (player2Choice == Choices.PAPER)) {
            player1.addWin();
            winner = player1;

            outValue.println("Player1 won!");
            System.out.println("Player1 won!");
            outValue.println();
            System.out.println();
        }
        else if (player1Choice == player2Choice) {
            outValue.println("Its a tie!");
            System.out.println("Its a tie!");
            outValue.println();
            System.out.println();
        }
        return winner;
    }
}
