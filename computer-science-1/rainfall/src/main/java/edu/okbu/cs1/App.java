package edu.okbu.cs1;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
   public static void main(String[] args) throws IOException {
        RainfallCalculator rain = new RainfallCalculator("rainFile.txt", "June");
        rain.test();
    }
}
