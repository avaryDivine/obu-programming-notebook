package edu.okbu.cs1;

public class Year {
    int theYear;

    public Year(int year) {
        theYear = year;
    }

    public boolean isLeapYear() {
        if ((theYear % 100) == 00) {
            if ((theYear % 400) == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        else if ((theYear % 4) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getTheYear() {
        return theYear;
    }

    public void setTheYear(int theYear) {
        this.theYear = theYear;
    }

}
