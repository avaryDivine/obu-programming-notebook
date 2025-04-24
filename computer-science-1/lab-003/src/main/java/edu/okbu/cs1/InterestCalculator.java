package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InterestCalculator {
    int years;
    double initialSavings;
    double interestRate;
    double currentSavings;
    Scanner fileScanner;
    FileInputStream inValues;
    FileOutputStream myFile;
    PrintWriter outValues;


    public InterestCalculator() throws FileNotFoundException {
        inValues = new FileInputStream("interest-calc.in");
        fileScanner = new Scanner(inValues);

        myFile = new FileOutputStream("interest-calc.out");
        outValues = new PrintWriter(myFile);
        
        years = fileScanner.nextInt();
        initialSavings = fileScanner.nextDouble();
        interestRate = fileScanner.nextDouble();
        currentSavings = fileScanner.nextDouble();
    }

    public void computeSavings() {
        currentSavings = initialSavings;
        outValues.println("Annual savings for " + years + " years:");
        for (int i = 0; i < years; ++i) {
            outValues.printf("$%.2f\n", currentSavings);
            currentSavings = currentSavings + (currentSavings * interestRate);
        }
        outValues.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        InterestCalculator c = new InterestCalculator();
        c.computeSavings();
    }

}
