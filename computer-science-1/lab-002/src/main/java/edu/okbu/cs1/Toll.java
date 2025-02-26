package edu.okbu.cs1;

public class Toll {
    int timeHour;
    int timeMinute;
    int typeDay;
    int numPeople;
    double tollAmount;

    public Toll(int hour, int day, int people) {
        timeHour = hour;
        typeDay = day;
        numPeople = people;
    }

    public double getTollAmount() {
        if (typeDay == 0) {
            if (timeHour < 6) {
                tollAmount = 1.55;
            }
            else if (timeHour < 10) {
                tollAmount = 4.65;
            }
            else if (timeHour < 18) {
                tollAmount = 2.35;
            }
            else {
                tollAmount = 1.55;
            }
        }
        else {
            if (timeHour < 8) {
                tollAmount = 1.55;
            }
            else if (timeHour < 12) {
                tollAmount = 3.05;
            }
            else if (timeHour < 16) {
                tollAmount = 3.45;
            }
            else if (timeHour < 19) {
                tollAmount = 3.60;
            }
            else if (timeHour < 22) {
                tollAmount = 3.05;
            }
            else {
                tollAmount = 1.55;
            }
        }

        if (numPeople >= 3) {
            if ((typeDay == 0) && (timeHour >= 6) && (timeHour < 10)) {
                tollAmount = tollAmount * 0.5;
            }
            else {
                tollAmount = 0.0;
            }
        }
        
        return tollAmount;
    }
}
