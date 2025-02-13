package edu.okbu.cs1;

public class Insurance {
    int userAge;
    double insurancePrice;

    public Insurance(int a, double p) {
        userAge = a;
        insurancePrice = p;
    }

    public double getPrice() {
        if (userAge < 16) {
            insurancePrice = 0.0;
            }
        else if (userAge < 25) {
            insurancePrice = 4800.0;
            }
        else if (userAge < 40) {
            insurancePrice = 2350.0;
            }
        else {
            insurancePrice = 2100.0;
        }
        return insurancePrice;  
    }
}
