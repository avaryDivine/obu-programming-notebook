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

    public int getWins() {
        return numWins;
    }

    public void addWin() {
        numWins = numWins + 1;
    }
}
