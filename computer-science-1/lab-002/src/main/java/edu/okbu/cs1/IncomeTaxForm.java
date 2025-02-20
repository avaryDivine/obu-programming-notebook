package edu.okbu.cs1;

public class IncomeTaxForm {
    final double TEN_PCT = 0.10;
    final double TWELVE_PCT = 0.12;
    final double TWENTY_TWO_PCT = 0.22;
    final double TWENTY_FOUR_PCT = 0.24;
    int wages;
    int interest;
    int unemployment;
    int status;
    int withheld;

    public IncomeTaxForm() {

    }

    public int getAGI() {
        return (wages + interest + unemployment);
    }

    public int getDeduction() {
        if (status == 1) {
            return 12000;
        }
        else {
            return 24000;
        }
    }

    public int getTaxable() {

    }

    public double getTax() {

    }

    public int getDue() {

    }

    public void setWages(int w) {
        
    }
}
