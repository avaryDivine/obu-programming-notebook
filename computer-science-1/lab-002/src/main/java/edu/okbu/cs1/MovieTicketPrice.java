package edu.okbu.cs1;

public class MovieTicketPrice {
    int userAge;
    int movieTicketPrice;

    public MovieTicketPrice(int a, int p) {
        userAge = a;
        movieTicketPrice = p;
    }

    public int getTicketPrice() {
        if (userAge <= 12) {
            movieTicketPrice = 11;
            }
        else if (userAge >= 65) {
            movieTicketPrice = 12;
            }
        else {
            movieTicketPrice = 14;
        }
        return movieTicketPrice;
    }
}
