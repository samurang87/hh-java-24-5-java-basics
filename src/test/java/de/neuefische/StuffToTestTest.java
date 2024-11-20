package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StuffToTestTest {

    @Test
    void summe_expect20_when10Plus10() {
        // Given
        int a = 10;
        int b = 10;
        int expectedSum = 20;
        // When
        int actualSum = StuffToTest.summe(a, b);
        // Then
        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    void Even_true_4() {
        int a = 4;
        Assertions.assertTrue(StuffToTest.isEven(a));
    }

    @Test
    void Even_false_77() {
        int a = 77;
        Assertions.assertFalse(StuffToTest.isEven(a));
    }

    @Test
    void product_20_10and2() {
        // Given
        int a = 10;
        int b = 2;
        int expectedProduct = 20;
        // When
        int res = StuffToTest.product(a, b);
        // Then
        Assertions.assertEquals(expectedProduct, res);
    }

    @Test
    void convertUppercase_ABC_abc() {
        Assertions.assertEquals("ABC", StuffToTest.convertToUppercase("abc"));
    }

    @Test
    void convertUppercase_ABC_ABC() {
        Assertions.assertEquals("ABC", StuffToTest.convertToUppercase("ABC"));
    }

    @Test
    void isPositive_false_minus2() {
        Assertions.assertFalse(StuffToTest.isPositive(-2));
    }

    @Test
    void isPositive_true_plus2() {
        Assertions.assertTrue(StuffToTest.isPositive(1));
    }
}
