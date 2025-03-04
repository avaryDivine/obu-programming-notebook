package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class List { 
    Scanner fileScanner;
    FileInputStream inList;

    public List() throws FileNotFoundException {
        fileScanner = new Scanner(inList);
        inList = new FileInputStream("myList.txt");
    }

    public double computeAverage() throws IOException {
        double numValues = 0.0;
        double sum = 0.0;
        

        while (fileScanner.hasNext()) {
            numValues = numValues + 1;
            sum = sum + fileScanner.nextInt();
        }

        double average = sum / numValues;
        System.out.print(average);
        inList.close();
        fileScanner.close();
        return average;
        
    }

    public double findMin() {
        while (fileScanner.hasNext()) {
            if 
        }
    }
    
    public static void main(String[] args) throws IOException {
        List l = new List();
        l.computeAverage();
    }
}

