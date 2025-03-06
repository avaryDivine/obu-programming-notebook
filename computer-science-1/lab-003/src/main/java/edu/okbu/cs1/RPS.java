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
        
        for (int i = 0; i <= n; ++i) {
           //p1Play = scnr.nextInt();
           //p2Play = scnr.nextInt();
           getWinner();
           updateScore(theWinner);
        }
    }

    public void getWinner() {
        if ((p1Play == 0) && (p2Play == 1)) {
            theWinner = "p2";
        }
        else if ((p1Play == 1) && (p2Play == 0)) {
            theWinner =  "p1";
        }
        else if ((p1Play == 2) && (p2Play == 1)) {
            theWinner =  "p1";
        }
        else if ((p1Play == 1) && (p2Play == 2)) {
            theWinner = "p2";
        }
        else if ((p1Play == 0) && (p2Play == 2)) {
            theWinner =  "p1";
        }
        else if ((p1Play == 2) && (p2Play == 0)) {
            theWinner = "p2";
        }
        else {
            theWinner = "tie";
        }
        System.out.println(theWinner);

    }

    public void updateScore(String theWinner) {
        if (theWinner == "p1") {
            p1Wins += 1;
        }
        else if (theWinner == "p2") {
            p2Wins += 1;
        }
        else if (theWinner == "ties") {
            ties += 1;
        }
    } 

    //public void printScores() {

    //}
}
