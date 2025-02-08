package edu.okbu.cs1;

public class CaffeineLevels {
    double caffeineMg;

    public CaffeineLevels(double mg) {
        caffeineMg = mg;
    }

    public double afterSixHours() {
        return caffeineMg * Math.pow(0.5, 6/6);
    }

    public double afterTwelveHours() {
        return caffeineMg * Math.pow(0.5, 12/6);
    }

    public double afterTwentyFour() {
        return caffeineMg * Math.pow(0.5, 24/6);
    }

}
