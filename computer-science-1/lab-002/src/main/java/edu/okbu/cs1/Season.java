package edu.okbu.cs1;

public class Season {
    String month;
    int day;

    public Season(String m, int d) {
        month = m;
        day = d;
    }

    public String getSeasonString() {
        if (day >= 1) {
            if (month.equals("March")) {
                if ((day >= 20) && (day <= 31)) {
                    return "Spring";
                }
                else if (day < 20) {
                    return "Winter";
                }
                else {
                    return "Invalid";
                }
            }
            else if ((month.equals("April") && (day <= 30)) || (month.equals("May") && (day <= 31))) {
                return "Spring";
            }
            else if (month.equals("June")) {
                if ((day >= 21) && (day <= 30)) {
                    return "Summer";
                }
                else if (day < 21) {
                    return "Spring";
                }
                else {
                    return "Invalid";
                }
            }
            else if ((month.equals("July") && (day <= 31)) || (month.equals("August") && (day <= 31))) {
                return "Summer";
            }
            else if (month.equals("September")) {
                if ((day >= 22) && (day <= 30)) {
                    return "Autumn";
                }
                else if (day < 22) {
                    return "Summer";
                }
                else {
                    return "Invalid";
                }
            }
            else if ((month.equals("October") && (day <= 31)) || (month.equals("November") && (day <= 30))) {
                return "Autumn";
            }
            else if (month.equals("December")) {
                if ((day >= 21) && (day <= 31)) {
                    return "Winter";
                }
                else if (day < 21){
                    return "Autumn";
                }
                else {
                    return "Invalid";
                }
            }
            else if ((month.equals("January") && (day <= 31)) || (month.equals("February") && (day <= 28))) {
                return "Winter";
            }
            else {
                return "Invalid";
            }
        }
        else {
            return "Invalid";
        }
    }
}
