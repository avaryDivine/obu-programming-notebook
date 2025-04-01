package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ArrayPractice {
    int[] theNumbers;
    Scanner fileScanner;
    FileInputStream arrayFile;

    public ArrayPractice() {

    }

    public void initialize(String inFileName) throws FileNotFoundException {
        arrayFile = new FileInputStream(inFileName);
        fileScanner = new Scanner(arrayFile);

        
        theNumbers = new int[4];
        while (fileScanner.hasNext()) {
            for (int i = 0; i < theNumbers.length; ++i) {
                theNumbers[i] = fileScanner.nextInt();
                System.out.println(theNumbers[i]);
            }
        } 
     
    }

    public void cleanup() throws IOException {
        fileScanner.close();
        arrayFile.close();
    }

    public void reverse() {
       

        for (int i = 0; i < theNumbers.length / 2; i++) {
            int j = theNumbers.length - 1 - i;
         
        
            int temp = theNumbers[i];
            theNumbers[i] = theNumbers[j];
            theNumbers[j] = temp;
        }

      System.out.println("Reversed array:");
      for (int i = 0; i < theNumbers.length; ++i) {
         System.out.println(theNumbers[i]);
        }
   }

    

    public static void main(String[] args) throws FileNotFoundException {
        ArrayPractice array = new ArrayPractice();
        array.initialize("ArrayFile.txt");
        array.reverse();
    }

}
