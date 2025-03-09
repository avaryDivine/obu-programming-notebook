package edu.okbu.cs1;
import java.util.Scanner;

public class RPS {
    int p1Wins;
    int p2Wins;
    int p1Play;
    int p2Play;
    String theWinner;
    int ties;
    int n;

    public RPS(int numGames) {
        n = numGames;
    }

    public void play(int n) {
        Scanner scnr = new Scanner(System.in);
        for (int i = 0; i < n; ++i) {
            System.out.println("Enter Player 1's move (0=Rock, 1=Paper, 2=Scissors):");
            p1Play = scnr.nextInt();
            System.out.println("Enter Player 2's move (0=Rock, 1=Paper, 2=Scissors):");
            p2Play = scnr.nextInt();
            getWinner();
            updateScore(theWinner);
        }
        printScores();
        scnr.close();
    }

    public void getWinner() {
        if ((p1Play == 0) && (p2Play == 1)) {
            theWinner = "Player 2";
        }
        else if ((p1Play == 1) && (p2Play == 0)) {
            theWinner =  "Player 1";
        }
        else if ((p1Play == 2) && (p2Play == 1)) {
            theWinner =  "Player 1";
        }
        else if ((p1Play == 1) && (p2Play == 2)) {
            theWinner = "Player 2";
        }
        else if ((p1Play == 0) && (p2Play == 2)) {
            theWinner =  "Player 1";
        }
        else if ((p1Play == 2) && (p2Play == 0)) {
            theWinner = "Player 2";
        }
        else if ((p1Play == p2Play)) {
            theWinner = "Tie";
        }
    }

    public void updateScore(String theWinner) {
        if (theWinner.equals("Player 1")) {
            System.out.println(theWinner + " wins this round!");
            p1Wins += 1;
        }
        else if (theWinner.equals("Player 2")) {
            System.out.println(theWinner + " wins this round!");
            p2Wins += 1;
        }
        else if (theWinner.equals("Tie")) {
            System.out.println("It is a tie!");
            ties += 1;
        }
    } 

    public void printScores() {
        System.out.println();
        System.out.println("Player 1 won " + p1Wins + " times!");
        System.out.println("Player 2 won " + p2Wins + " times!");
        System.out.println("You tied " + ties + " times!");
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the number of rounds: ");
        int numGames = scnr.nextInt();
        
        RPS game = new RPS(numGames);
        game.play(numGames);

        scnr.close();
    }
}
