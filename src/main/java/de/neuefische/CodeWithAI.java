package de.neuefische;

public class CodeWithAI {

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
    public static boolean isPalindrome(String str) {
        // Base cases
        if (str.length() <= 1) {
            return true;
        }

        // Compare first and last character
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive call with substring
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    // write a method that generates the first n prime numbers
    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;
        int number = 2;
        while (count < n) {
            if (isPrime(number)) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        return primes;
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
