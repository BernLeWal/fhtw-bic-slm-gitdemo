package at.fhtw.slm.consoleapp;

public class Calculator {
    private int offset;

    public Calculator(int offset) {
        this.offset = offset;
    }

    public Calculator() {
        offset = -1;
    }

    public int add(int a, int b) {
        return a + b + offset;
    }

    public int sub(int a, int b) {
        return a - b + offset;
    }

    public int mul(int a, int b) {
        return a*b + offset;
    }
}
