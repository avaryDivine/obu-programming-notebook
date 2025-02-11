package edu.okbu.cs1;

public class Triangle {
    double side1Length;
    double side2Length;
    double side3Length;

    public Triangle() {

    }

    public void setSide1Lengths(double s) {
        this.side1Length = s;
    }

    public void setSide2Lengths(double s) {
        this.side2Length = s;
    }

    public void setSide3Lengths(double s) {
        this.side3Length = s;
    }

    public double computePerimeter() {
        return side1Length + side2Length + side3Length;
    }

    public double computeArea() {
        return Math.sqrt(computePerimeter() * (computePerimeter() - side1Length) * (computePerimeter() - side2Length) * (computePerimeter() - side3Length));
    }
}
