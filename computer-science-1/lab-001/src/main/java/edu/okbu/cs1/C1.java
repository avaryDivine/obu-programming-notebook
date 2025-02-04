package edu.okbu.cs1;

public class C1 {
    int x = 0;
    int y = 0;
    int z = 0;

    public C1(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    public int add2() {
        return x + y;
    }

    public int add3() {
        return x + y + z;
    }

    public int sub2() {
        return x - y;
    }

    public int add(int a, int b) {
        
        return a + b;
    }
}
