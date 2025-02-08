
package edu.okbu.cs1;
import java.util.Random;

public class DieRoll {
    int minPip;
    int maxPip;

    public DieRoll(int min, int max) {
        minPip = min;
        maxPip = max;
    }

    public int roll() {
        return randGen.nextInt(7+ 1) + 1;
    }
}
