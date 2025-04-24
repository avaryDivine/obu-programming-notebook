package edu.okbu.cs1;

public class Temperature {
    

    public Temperature() {

    }

    public void celciusToFahrenheit(double min, double max) {
        while (min < max) {
            double farenheitValue;
            farenheitValue = (min * 9.0 / 5.0) + 32.0;
            System.out.println(min + " C " + "= " + farenheitValue + " F");
            min = min + 5;
        }
    }

    public void farenheitToCelcius(double min, double max) {
        while (min < max) {
            double celciusValue;
            celciusValue = (min - 32.0) * (0.5556);
            System.out.println(min + " F " + "= " + celciusValue + " C");
            min = min + 5;
        }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.celciusToFahrenheit(10, 20);
        t.farenheitToCelcius(10, 20);
    }
}
