package edu.okbu.cs1;


public class GameBoard {
    String[][] board = new String[3][3];
    String boardString;

    public GameBoard() {

    }

    public String toString() {
        boardString = null;
        for (int i = 0; i < board.length; ++i){
            for (int j = 0; j < board[i].length; ++j) {
                if ((i == 0) && (j == 0)) {
                    boardString = board[i][j];
                }
                else {
                boardString = boardString + board[i][j];
                }
            }
            boardString = boardString + "\n";
        }
        //System.out.print(boardString);
        return boardString;
    }

    public void display() {
        System.out.print(toString());
    }

    public static void main(String[] args) {
        GameBoard playboard = new GameBoard();
        playboard.display();
    }
}
