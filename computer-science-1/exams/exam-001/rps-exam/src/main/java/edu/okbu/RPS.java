package edu.okbu;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RPS {
    Scanner fileScanner;
    FileInputStream rpsFile;
    FileOutputStream outFile;
    PrintWriter outValue;
    Player player1;
    Player player2;
    int numGames;

    public RPS() {
        
    }

    public void initialize(String fileName) throws IOException {
        // Open the file given by the parameter fileName
        rpsFile = new FileInputStream(fileName);
        fileScanner = new Scanner(rpsFile);

        // The first line in the file is the name of the first player
        String player1Name = fileScanner.nextLine();

        // The second line in the file is the name of the second player
        String player2Name = fileScanner.nextLine();

        // The third line in the file is the number of games to play
        numGames = fileScanner.nextInt();

        // Read in these values
        
        // Create an instance of the Player class with the name from the 
        // first line in the file and initialize the player1 instance variable
        //player1 = Player(player1Name);
        // Create an instance of the Player class with the name from the 
        // second line in the file and initialize the player2 instance variable
        //player2 = Player(player2Name);
        // Initialize the numGames instance variable from the third line in the
        // file.

        // Open a file / PrintWriter and assign to the outWriter instance variable.
        // This will be used to storing game play information.
        outFile = new FileOutputStream("rps.out");
        outValue = new PrintWriter(outFile);
        outValue.print(player1Name + " " + player2Name + " " + numGames);

        fileScanner.close();
        rpsFile.close();
        outValue.close();
    }

    public void play() {

    }
}
