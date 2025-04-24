package edu.okbu.cs1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] hzPlayers; // declares integer array
        hzPlayers = new int[5];

        hzPlayers[0] = 123;
        hzPlayers[1] = 234;
        hzPlayers[2] = 567;
        hzPlayers[3] = 788;
        hzPlayers[4] = 76;

        System.out.println(hzPlayers[3]);
        System.out.println(hzPlayers.length);
    }
}
