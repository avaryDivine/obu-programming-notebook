package edu.okbu;
import java.util.Scanner;

public class Player {
    String playerName;
    Choices choice;
    int wins;
    Scanner scnr = new Scanner(System.in);

    public Player(String name) {
        playerName = name;
    }

    public String getName() {
        return playerName;
    }

    public void setName(String name) {
        playerName = name;
    }

    public Choices getChoice() {
        System.out.println("Enter your play (R = Rock, P = Paper, S = Scissors): ");
        String userInput = scnr.nextLine();
        if (userInput.equals("R")) {
            choice = Choices.ROCK;
        }
        else if (userInput.equals("P")) {
            choice = Choices.PAPER;
        }
        else if (userInput.equals("S")) {
            choice = Choices.SCISSORS;
        }
        return choice;
    }

    public int getWins() {
        return wins;
    }

    public void addWin() {
        wins = wins + 1;
    }

    public void resetWins() {
        wins = 0;
    }

    public String toString() {
        String playerInfo;
        playerInfo = "Player name: " + playerName + "\n" + "Wins: " + wins;
        return playerInfo;
        
    }

   
}
