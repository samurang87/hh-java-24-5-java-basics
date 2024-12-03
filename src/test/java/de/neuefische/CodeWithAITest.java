package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CodeWithAITest {

    @Test
    void reverseString_returnsReversedString() {
        // Given
        String input = "Hello";

        // When
        String actual = CodeWithAI.reverseString(input);

        // Then
        String expected = "olleH";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_returnsTrueForPalindrome() {
        // Given
        String input = "racecar";

        // When
        boolean actual = CodeWithAI.isPalindrome(input);

        // Then
        Assertions.assertTrue(actual);
    }

    @Test
    void generatePrimes_returnsFirstFivePrimes() {
        // Given
        int n = 5;

        // When
        int[] actual = CodeWithAI.generatePrimes(n);

        // Then
        int[] expected = {2, 3, 5, 7, 11};
        Assertions.assertArrayEquals(expected, actual);
    }
}
