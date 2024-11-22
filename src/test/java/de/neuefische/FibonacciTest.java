package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testFibonacci_0_0() {
        int expected = 0;
        int actual = Fibonacci.getFibonacci(0);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFibonacci_1_1() {
        int expected = 1;
        int actual = Fibonacci.getFibonacci(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFibonacci_2_1() {
        int expected = 1;
        int actual = Fibonacci.getFibonacci(1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFibonacci_7_13() {
        int expected = 13;
        int actual = Fibonacci.getFibonacci(7);
        Assertions.assertEquals(expected, actual);
    }
}
