package edu.okbu.cs1;

public class AnniversaryMessage {
    int numYears;

    public AnniversaryMessage(int y) {
        numYears = y;
    }

    public String getAnniversaryMessage() {
        if (numYears == 1) {
            return "Your first year -- great!";
        }
        else if (numYears == 10) {
            return "A whole decade -- impressive.";
        }
        else if (numYears == 25) {
            return "Your silver anniversary -- enjoy.";
        }
        else if (numYears == 50) {
            return "Your golden anniversay -- amazing.";
        }
        else {
            return "Nothing special.";
        }
    }
}
