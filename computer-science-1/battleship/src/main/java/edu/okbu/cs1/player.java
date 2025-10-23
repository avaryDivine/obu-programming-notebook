package edu.okbu.cs1;

import java.util.Scanner;

public class player {
    Scanner scnr = new Scanner(System.in);
    int numWins;
    int[] choice = new int[2];
    gameBoard game;
    int loopNum = 0;
    int hitNum = 0;
    int elseRow = 2;
    int elseCol = 0;

    public player(gameBoard game) {
        this.game = game;
    }

    public int[] choice(String playString) {
        if (loopNum < game.hiddenBoard.length) {
            if (playString.equals("")) {  
                choice[0] = loopNum;
                choice[1] = loopNum;

                loopNum += 1;
            }
            else if (playString.equals("S")) {
                choice[0] = loopNum;
                choice[1] = loopNum;
                loopNum += 1;
                hitNum = 0;
            }
            else if (playString.equals("H")) {
                hitNum = 1;
                choice[1] = choice[1] + 1;
            

                if (choice[1] >= game.hiddenBoard.length) {
                    choice[0] = choice[0] + 1;
                    choice[1] = choice[1] - 1;
                }
            }
            else if (playString.equals("M")) {
                if (hitNum == 1) {
                    choice[0] = choice[0] + 1;
                    choice[1] = choice[1] - 1;
                    hitNum += 1;
                }
                else if (hitNum == 2) {
                    choice[0] = choice[0] - 1;
                    choice[1] = choice[1] - 1;
                    hitNum += 1;
                }
                else if (hitNum == 3) {
                    choice[0] = choice[0] - 1;
                    choice[1] = choice[1] + 1;
                    hitNum = 0;
                    loopNum += 1;
                }
            }
        }
        else if (loopNum >= game.hiddenBoard.length) {
            if (playString.equals("S")) {
                choice[0] = elseRow;
                choice[1] = elseCol;
                hitNum = 0;
                elseRow += 1;
                elseCol += 1;
            }
            else if (playString.equals("H")) {
                hitNum = 1;
                choice[1] = choice[1] + 1;
            

                if (choice[1] >= game.hiddenBoard.length) {
                    choice[0] = choice[0] + 1;
                    choice[1] = choice[1] - 1;
                }
            }
            else if (playString.equals("M")) {
                if (hitNum == 1) {
                    choice[0] = choice[0] + 1;
                    choice[1] = choice[1] - 1;
                    hitNum += 1;
                }
                else if (hitNum == 2) {
                    choice[0] = choice[0] - 1;
                    choice[1] = choice[1] - 1;
                    hitNum += 1;
                }
                else if (hitNum == 3) {
                    choice[0] = choice[0] - 1;
                    choice[1] = choice[1] + 1;
                    hitNum = 0;
                    elseRow += 1;
                    elseCol += 1;
                }
            }
            else {
                choice[0] = elseRow;
                choice[1] = elseCol;

                elseRow += 1;
                elseCol += 1;
            }
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

