/*
Step 1: Filter a list of numbers and only output the even numbers.
Step 2: Use 'map' and double each number in the list.
Step 3: Sort the list in ascending order.
Step 4: Perform a 'reduce' operation to calculate the sum of all numbers in the list.
Step 5: Use 'forEach' and output each processed number.
Step 6: Collect the processed numbers into a new list using 'collect'.*/

package de.neuefische.streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsPlayground {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(num -> num % 2 == 0).toList();
    }

    public static List<Integer> doubleAllNumbers(List<Integer> numbers) {
        return numbers.stream().map(num -> num * 2).collect(Collectors.toList());
    }

    public static int sumAllNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0, (a, b) -> a + b);
    }

    public static List<Integer> sortAscending(List<Integer> numbers) {
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> printAndReturnAllNumbers(List<Integer> numbers) {
        return numbers.stream().peek(System.out::println).collect(Collectors.toList());
    }

    public static void printAllNumbers(List<Integer> numbers) {
        numbers.forEach(System.out::println);
    }
}
