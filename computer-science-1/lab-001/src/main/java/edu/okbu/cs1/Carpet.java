package edu.okbu.cs1;

public class Carpet {
    double price;
    int width;
    int length;
    final double TAX_RATE = 0.07;
    final double WASTE_PCT = 1.2;
    final double LABOR_RATE = 0.75;

    public Carpet(double p, int w, int l) {
        price = p;
        width = w;
        length = l;
    }

    public double computeSquareFootage() {
        return length * width;
    }

    public double computeCarpetCost() {
        return price * computeSquareFootage() * WASTE_PCT;
    }

    public double computeLabor() {
        return LABOR_RATE * computeSquareFootage();
    }

    public double computeTax() {
        return TAX_RATE * (computeCarpetCost() + computeLabor());
    }

    public double totalCost() {
        return computeTax() + computeLabor() + computeCarpetCost();
    }

}
