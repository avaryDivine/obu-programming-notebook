package edu.okbu.cs1;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) throws IOException {
        theGame game = new theGame();
        game.initialize();
        game.play();
        game.summary();
    }
}
