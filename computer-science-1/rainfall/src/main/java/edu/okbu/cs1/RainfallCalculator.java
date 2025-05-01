package edu.okbu.cs1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;


public class RainfallCalculator {
    float[] inRain;
    String fileName;
    String monthName;
    Scanner fileScanner;
    FileInputStream inFile;
    FileOutputStream outFile;
    PrintWriter outWriter;
    int loopNum = 0;
    int i;
    float averageRain;
    float minimumRain;
    float maximumRain;
    String outString;

    public RainfallCalculator(String fileName, String month) throws FileNotFoundException {
        inRain = new float[30];
        monthName = month;
        inFile = new FileInputStream(fileName);
        fileScanner = new Scanner(inFile);

        while (fileScanner.hasNext()) {
            inRain[loopNum] = fileScanner.nextFloat();
            if ((inRain[loopNum] < 0) || (inRain[loopNum] > 17)) {
                inRain[loopNum] = 0;
            }
            loopNum = loopNum + 1;
        }
    }

    public void setRainFallOnDay(int day, float rainFall) {
        inRain[day] = rainFall;
    }

    public float getRainFallOnDay(int day) {
        return inRain[day];
    }

    public float average() {
        averageRain = 0;
        float sumRain = 0;
        for (i = 0; i < inRain.length; ++i) {
            sumRain = sumRain + inRain[i];
        }

        averageRain = sumRain / inRain.length;
        return averageRain;
    }

    public float minimum() {
        for (i = 0; i < inRain.length; ++i) {
            if (i == 0) {
                minimumRain = inRain[i];
            }
            else {
                if (inRain[i] < minimumRain) {
                    minimumRain = inRain[i];
                }
            }
        }

        return minimumRain;
    }

    public float maximum() {
        for (i = 0; i < inRain.length; ++i) {
            if (i == 0) {
                maximumRain = inRain[i];
            }
            else {
                if (inRain[i] > maximumRain) {
                    maximumRain = inRain[i];
                }
            }
        }
        return maximumRain;
    }

    public String toString() {
        outString = monthName + ":" + "\n";
        outString += "Average amount of rain: " + String.format("%.2f", average()) + " inches \n";
        outString += "Minimum amount of rain: " + minimum() + " inches \n";
        outString += "Maximum amount of rain: " + maximum() + " inches \n";
        return outString;

    }

    public void outFilePrint(String outName) throws FileNotFoundException {
        outFile = new FileOutputStream(outName);
        outWriter = new PrintWriter(outFile);

        outWriter.println(toString());
        outWriter.close();
    }

    public void test() {
        for (i = 0; i < inRain.length; ++i) {
            System.out.println(inRain[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        RainfallCalculator rain = new RainfallCalculator("rainFile.txt", "June");
        rain.test();
        System.out.printf("%.2f", rain.average());
        System.out.println();
        System.out.println(rain.minimum());
        System.out.println(rain.maximum());
        System.out.println(rain.toString());
        rain.outFilePrint("rainFallOut.txt");
    }
}


