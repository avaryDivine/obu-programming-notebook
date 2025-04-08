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
                if (board[i][j] == null) {
                    if (i == 0 && j == 0) {
                        boardString = "_ ";
                    }
                    else {
                        boardString = boardString + "_ ";
                    }
                }
                else if ((i == 0) && (j == 0)) {
                    boardString = board[i][j] + " ";
                }
                else {
                    boardString = boardString + board[i][j] + " ";
                }
            }
            boardString = boardString + "\n";
        }
        return boardString;
    }

    public void display() {
        System.out.print(toString());
    }

    public String winner() {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[i].length - 2; ++j) {
                if ((board[i][j] != null) && board[i][j].equals(board[i][j+1]) && board[i][j].equals(board[i][j+2])) {
                    return board[i][j];
                }
            }
        }
        for (int i = 0; i < board.length - 2; ++i) {
            for (int j = 0; j < board[i].length; ++j) {
                if ((board[i][j] != null) && board[i][j].equals(board[i+1][j]) && board[i][j].equals(board[i+2][j])) {
                    return board[i][j];
                }
            }
        }
        if ((board[0][0] != null) && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return board[0][0];
        }
        if ((board[0][2] != null) && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
            return board[0][2];
        }
        return null;
    }

    public Boolean validMove(int[] move) {
        int row = move[0];
        int column = move[1];
        if (board[row][column] == null) {
            return true;
        }
        return false;
    }

    public void resetBoard() {
        for (int i = 0; i < board.length; ++i){
            for (int j = 0; j < board[i].length; ++j) {
                board[i][j] = null;
            }
        }
    }

    public static void main(String[] args) {
        GameBoard playboard = new GameBoard();
        playboard.display();
        playboard.winner();
    }
}
