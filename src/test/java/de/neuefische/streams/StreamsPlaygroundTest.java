package de.neuefische.streams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamsPlaygroundTest {

    @Test
    void filterEvenNumbers_given1to5_returns2and4(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> res = StreamsPlayground.filterEvenNumbers(numbers);
        Assertions.assertEquals(List.of(2, 4), res);
    }

    @Test
    void doubleAllNumbers_given1to5_returnsEven2to10(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> res = StreamsPlayground.doubleAllNumbers(numbers);
        Assertions.assertEquals(List.of(2, 4, 6, 8, 10), res);
    }

    @Test
    void sumAllNumbers_given1to5_returns15(){
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        int res = StreamsPlayground.sumAllNumbers(numbers);
        Assertions.assertEquals(15, res);
    }

    @Test
    void sortAscending_given5to1_returns1to5(){
        List<Integer> numbers = List.of(5, 4, 3, 2, 1);
        List<Integer> res = StreamsPlayground.sortAscending(numbers);
        Assertions.assertEquals(List.of(1, 2, 3, 4, 5), res);
    }

    @Test
    void printAndReturnsAllNumbers_printsAllValuesAndReturns() {
        List<Integer> numbers = List.of(1, 2, 3);
        List<Integer> res = StreamsPlayground.printAndReturnAllNumbers(numbers);
        Assertions.assertEquals(numbers, res);

        // not sure how to test this
        StreamsPlayground.printAllNumbers(res);
    }
}
