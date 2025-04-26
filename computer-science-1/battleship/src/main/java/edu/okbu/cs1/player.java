package edu.okbu.cs1;

import java.util.Scanner;

public class player {
    Scanner scnr = new Scanner(System.in);
    int numWins;
    int[] choice = new int[2];
    gameBoard game;

    public player(gameBoard game) {
        this.game = game;
    }

    public int[] choice() {
        System.out.println("Type the row number of your choice: ");
        choice[0] = scnr.nextInt();

        System.out.println("Type the column number of your choice: ");
        choice[1] = scnr.nextInt();

        while (!game.validMove(choice)) {
            System.out.println("That place on the board is already filled. Type the row number of your new choice: ");
            choice[0] = scnr.nextInt();

            System.out.println("Type the column number of your new choice: ");
            choice[1] = scnr.nextInt();
        }

        return choice;
    }

    public int getWins() {
        return numWins;
    }

    public void addWin() {
        numWins = numWins + 1;
    }
}
