package edu.okbu;
import java.util.Scanner;

public class Player {
    String playerName;
    Choices choice;
    int wins;
    Scanner scnr = new Scanner(System.in);

    public Player(String name) {

    }

    public Choices getChoice() {
        System.out.println("Enter your play (R = Rock, P = Paper, S = Scissors): ");
        if (scnr.next().equals("R")) {
            choice = Choices.ROCK;
        }
        else if (scnr.next().equals("P")) {
            choice = Choices.PAPER;
        }
        else if (scnr.next().equals("S")) {
            choice = Choices.SCISSORS;
        }

        return choice;
    }
}
