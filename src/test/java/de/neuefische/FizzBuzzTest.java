package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void expect1_whenGivenNumber1() {
        // Given
        int number = 1;
        // When
        String actual = TDDPractice.fizzBuzz(number);
        String expected = "1";
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expect2_whenGivenNumber2() {
        // Given
        int number = 2;
        // When
        String actual = TDDPractice.fizzBuzz(number);
        String expected = "2";
        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizz_whenGivenNumber3() {
        int number = 3;
        String actual = TDDPractice.fizzBuzz(number);
        String expected = "Fizz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectBuzz_whenGivenNumber5() {
        int number = 5;
        String actual = TDDPractice.fizzBuzz(number);
        String expected = "Buzz";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void expectFizzBuzz_whenGivenNumber15() {
        int number = 15;
        String actual = TDDPractice.fizzBuzz(number);
        String expected = "FizzBuzz";
        Assertions.assertEquals(expected, actual);
    }
}
