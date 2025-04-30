package edu.okbu.cs1;

import java.util.Scanner;

public class aiPlayer {
    int numWins = 0;
    int[] choice = new int[2];
    Scanner scnr = new Scanner(System.in);
    String choiceChar;
    GameBoard game;


    public aiPlayer(GameBoard game) {
        this.game = game;
    }

    public int[] choice() {
        if (game.board[1][1] == null) {
            choice[0] = 1;
            choice[1] = 1;
        }
        else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    choice[0] = i;
                    choice[1] = j;
                    if (game.validMove(choice)) {
                        return choice;
                    }
                }
            }
        }
        return choice;
    }

    public String xo() {
        choiceChar = "O";
        return choiceChar;
    }

    public int getWins() {
        return numWins;
    }

    public void addWin() {
        numWins = numWins + 1;
    }

}

