package edu.okbu.cs1;

public class InterstateHighway {
    int highwayNumber;

    public InterstateHighway(int hwy) {
        highwayNumber = hwy;
    }

    public boolean isAuxiliary() {
        return ((highwayNumber >= 100) && (highwayNumber <= 999)); 
    }

    public String direction() {
        if (highwayNumber % 2 == 0) {
            return "east/west"; 
        }
        else {
            return "north/south";
        }
    
    }
    
    public int primaryNumber() {
        if (isAuxiliary()) {
            return highwayNumber % 100;
        }
        else {
            return highwayNumber;
        }
    }
}
