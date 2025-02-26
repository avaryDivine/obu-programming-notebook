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
        return getAGI() - getDeduction();
    }

    public double getTax() {
        if (status == 1) {
            if ((getTaxable() >= 0) && (getTaxable() <= 10000)) {
                return Math.round(getTaxable()*TEN_PCT);
            }
            else if ((getTaxable() >= 10001) && (getTaxable() <= 40000)) {
                return 1000 + ((getTaxable() - 10000) * TWELVE_PCT);
            }
            else if ((getTaxable() >= 40001) && (getTaxable() <= 85000)) {
                return 4600 + ((getTaxable() - 40000) * TWENTY_TWO_PCT);
            }
            else {
                return 14500 + ((getTaxable() - 85000) * TWENTY_FOUR_PCT);
            }
        }
        else {
            if ((getTaxable() >= 0) && (getTaxable() <= 20000)) {
                return Math.round(getTaxable()*TEN_PCT);
            }
            else if ((getTaxable() >= 20001) && (getTaxable() <= 80000)) {
                return 2000 + ((getTaxable() - 20000) * TWELVE_PCT);
            }
            else {
                return 9200 + ((getTaxable() - 80000) * TWENTY_TWO_PCT);
            }
        }
    }

    public int getDue() {
        return (Math.abs((int)getTax() - withheld));
    }

    public void setWages(int w) {
        this.wages = w;
    }

    public void setInterest(int i) {
        this.interest = i;
    }

    public void setUnemployment(int u) {
        this.unemployment = u;
    }

    public void setStatus(int s) {
        this.status = s;
    }

    public void setWithheld(int w) {
        this.withheld = w;
    }
}
