package de.neuefische;

public class TDDPractice {
    public static String fizzBuzz(int number) {


        if (number % 3 == 0) {
            if (number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        }
        if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
