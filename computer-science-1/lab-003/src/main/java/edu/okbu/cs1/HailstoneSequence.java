package edu.okbu.cs1;
import java.util.Scanner;

public class HailstoneSequence {
    int theNumber;

    public HailstoneSequence() {

    }

    public String computeHailstoneSequence() {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Type an integer: ");
        theNumber = scnr.nextInt();
        System.out.print(theNumber + "\t");

        while (theNumber != 1) {
            if (theNumber % 2 == 0) {
                theNumber = theNumber / 2;
            }
            else if (theNumber % 2 != 0) {
                theNumber = (theNumber * 3) + 1;
            }
            System.out.print(theNumber + "\t");
        }
        scnr.close();
        return "";   
        
    }


public static void main(String[] args) {
    HailstoneSequence h = new HailstoneSequence();
    h.computeHailstoneSequence();
}
}
