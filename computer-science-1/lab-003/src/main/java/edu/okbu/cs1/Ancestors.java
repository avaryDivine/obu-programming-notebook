package edu.okbu.cs1;

public class Ancestors {
    int userYear;
    int consYear;
    int numAnc;

    public Ancestors(int year, int cons, int num) {
        userYear = year;
        consYear = cons;
        numAnc = num;
    }

    public void printInformation() {
        while (consYear >= userYear) {
            System.out.println("Ancestors in " + consYear + ": " + numAnc);
            numAnc = 2 * numAnc;
            consYear = consYear - 20;
        }
    }

    public static void main(String[] args) {
        Ancestors a = new Ancestors(1600, 2020, 2);
        a.printInformation();
    }
}
