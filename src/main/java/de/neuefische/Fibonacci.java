package de.neuefische;

public class Fibonacci {
    public static int getFibonacci(int i) {
        if (i < 2) {
            return i;
        } else {
            return getFibonacci(i - 1) + getFibonacci(i - 2);
        }
    }

}
