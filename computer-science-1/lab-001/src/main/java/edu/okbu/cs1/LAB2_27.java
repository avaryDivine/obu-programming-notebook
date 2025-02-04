package edu.okbu.cs1;

public class LAB2_27 {
    double x;
    double y;
    double z;

    public LAB2_27(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double xpowz() {
        return Math.pow(x,z);
    }

    public double xpowypowz() {
        return Math.pow(x, Math.pow(y,z));
    }

    public double absy() {
        return Math.abs(y);
    }

    public double sqrtof() {
        return Math.sqrt(Math.pow((x*y),z));
    }

}
