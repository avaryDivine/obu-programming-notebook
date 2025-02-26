package edu.okbu.cs1;

public class ExactChange {
    int numPennies;
    int numDollars;
    int numDimes;
    int numNickels;
    int numQuarters;
    int totalChange;

    public ExactChange(int total) {
        totalChange = total;
    }

    public int getNumDollars() {
        numDollars = totalChange / 100;
        totalChange = totalChange % 100;
        return numDollars;
    }

    public int getNumQuarters() {
        numQuarters = totalChange / 25;
        totalChange = totalChange % 25;
        return numQuarters;
    }

    public int getNumDimes() {
        numDimes = totalChange / 10;
        totalChange = totalChange % 10;
        return numDimes;
    }

    public int getNumNickels() {
        numNickels = totalChange / 5;
        totalChange = totalChange % 5;
        return numNickels;
    }

    public int getNumPennies() {
        numPennies = totalChange;
        return numPennies;
    }
}
