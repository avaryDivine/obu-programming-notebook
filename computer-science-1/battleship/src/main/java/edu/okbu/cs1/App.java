package edu.okbu.cs1;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        Battleship game = new Battleship();
        game.initialize();
        game.play();
    }
}
