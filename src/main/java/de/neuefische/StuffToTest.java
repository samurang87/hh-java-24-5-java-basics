package de.neuefische;

public class StuffToTest {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int summe(int a, int b){
        return a+b;
    }

    public static boolean isEven(int a){
        return ( a%2 == 0);
    }

    public static int product(int a, int b){
        return a*b;
    }

    public static String convertToUppercase(String word) {
        return word.toUpperCase();
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}
