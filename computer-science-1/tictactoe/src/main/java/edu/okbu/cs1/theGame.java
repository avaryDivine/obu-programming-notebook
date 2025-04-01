package edu.okbu.cs1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class theGame {
    int numGames;
    String summaryString;
    FileOutputStream outFile;
    PrintWriter outWriter;

    public theGame() {
        
    }

    public void initialize() throws FileNotFoundException {
        outFile = new FileOutputStream("tictactoe.out");
        outWriter = new PrintWriter(outFile);
    }

    public void play() throws IOException {
        numGames = 3;

        for (int i = 0; i < numGames; ++i) {
            outWriter.println("Game Number " + i + ":");

        }

        
    }

    public String summary() throws IOException {
        summaryString = "After " + numGames + " games :\n";
        summaryString += "Player 1 won __ times\n"; 
        //TODO: add numWins
        summaryString += "Player 2 won __ times\n";
        //TODO: add numWins
        outWriter.println(summaryString);
        outWriter.close();
        return summaryString;

    }
     
    public static void main(String[] args) throws IOException {
        theGame game = new theGame();
        game.initialize();
        game.play();
        game.summary();
    }


}
