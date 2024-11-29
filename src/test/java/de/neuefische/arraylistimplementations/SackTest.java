package de.neuefische.arraylistimplementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SackTest {

    @Test
    void testSack_returnsContent() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Sack sack = new Sack(array);
        Assertions.assertArrayEquals(sack.getAll(), array);
    }

    @Test
    void add1_adds1toContent() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sack sack = new Sack(array);
        sack.add(1);
        Object[] sackContent = sack.getAll();
        Assertions.assertEquals(1, sackContent[9]);
    }

    @Test
    void removeLast_removesLastFromContent() {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Sack sack = new Sack(array);
        sack.removeLast();
        Assertions.assertEquals(8, sack.getSize());
        Assertions.assertEquals(8, sack.getAll()[7]);
    }

    @Test
    void removeByIndex_removesCorrectIndex() {
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] expected = {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Sack sack = new Sack(array);
        sack.removeByIndex(5);
        Assertions.assertArrayEquals(expected, sack.getAll());
    }
}
