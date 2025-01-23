package okbu.edu.cis2703;

public class Jan23 {
    private int temp;
    public Jan23() {

    }
    public Jan23(int t){
        temp = t;
    }
    @Override
    public String toString() {
        return "Today's temperature is " + temp;
    }
}