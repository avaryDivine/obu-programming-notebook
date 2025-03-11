package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class List { 
    Scanner fileScanner;
    FileInputStream inList;

    public List() throws FileNotFoundException {
        inList = new FileInputStream("myList.txt");
        fileScanner = new Scanner(inList);
    }

    public double computeAverage() throws IOException {
        double numValues = 0.0;
        double sum = 0.0;
        

        while (fileScanner.hasNext()) {
            numValues = numValues + 1;
            sum = sum + fileScanner.nextInt();
        }

        fileScanner.close();
        inList.close();

        double average = sum / numValues;
        System.out.println("Average: " + average);
        return average;
        
    }

    public double findMin() throws IOException {
        inList = new FileInputStream("myList.txt");
        fileScanner = new Scanner(inList);
        int min = fileScanner.nextInt();

        while (fileScanner.hasNext()) {
            int value = fileScanner.nextInt();
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Min: " + min);
        fileScanner.close();
        inList.close();
        return min;
    }
    
    
    public static void main(String[] args) throws IOException {
        List l = new List();
        l.computeAverage();
        l.findMin();
        
    }
}

