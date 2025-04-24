package edu.okbu.cs1;

import java.util.Scanner;

public class ListAverage {
    double theAverage;
    int currValue;
    int numValues;
    int valuesSum;

    public ListAverage() {

    }

    Scanner scnr = new Scanner(System.in);

    public void computeAverage() {
        valuesSum = 0;
        numValues = 0;
        System.out.println("Type your values, press 0 when done: ");
        currValue = scnr.nextInt();
        while (currValue > 0) {
            valuesSum = valuesSum + currValue;
            numValues = numValues + 1;
            currValue = scnr.nextInt();
        }
        theAverage = valuesSum / numValues;
        System.out.println("Average: " + (valuesSum / numValues));
    }

    public static void main(String[] args) {
        ListAverage l = new ListAverage();
        l.computeAverage();
    }
}
