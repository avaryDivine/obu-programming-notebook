package edu.okbu.cs1;

public class LAB2_25 {
    int userNum;
    int divNum;

    public LAB2_25(int u, int d) {
        userNum = u;
        divNum = d;
    }

    public int do1x() {
        return userNum/divNum;
    }

    public int do2x() {
        return userNum / divNum / divNum;
    }

    public int do3x() {
        return userNum / divNum / divNum / divNum;
    }
}
