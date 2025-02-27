package edu.okbu.cs1;

public class InterestCalculator {
    double initialSavings;
    double interestRate;
    double currentSavings;

    public InterestCalculator(double init, double rate, double current) {
        initialSavings = init;
        interestRate = rate;
        currentSavings = current;
    }

    public void computeSavings(int years) {
        currentSavings = initialSavings;
        System.out.println("Annual savings for " +  years + "years:");
        for (int i = 0; i < years; ++i) {
            System.out.println("$" + currentSavings);
            currentSavings = currentSavings + (currentSavings * interestRate);
        }
    }

    public static void main(String[] args) {
        InterestCalculator c = new InterestCalculator(10000, 0.05, 0.0);
        c.computeSavings(10);
    }

}
