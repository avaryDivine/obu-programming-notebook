package edu.okbu.cs1;

public class Battleship {
    int numGames;
    int numTurns;
    gameBoard mainBoard;
    gameBoard hiddenBoard;
    player thePlayer;

    public Battleship() {
        mainBoard = new gameBoard();
        hiddenBoard = new gameBoard();
        thePlayer = new player(mainBoard);
    }
}
