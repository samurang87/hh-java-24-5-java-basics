package de.neuefische;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Java is cool");
        int a = 4;
        int b = 2;
        System.out.println("Sum: " + (a + b));

        int summe = a + b;
        int subtract = a - b;
        int multiply = a * b;
        int division = a / b;
        System.out.println("Sum: " + summe);
        System.out.println("Subtraction: " + subtract);
        System.out.println("Multiplication: " + multiply);
        System.out.println("Division: " + division);

        System.out.println("It is " + (a > b) + " that a is greater than b");
        System.out.println("It is " + (a < b) + " that a is smaller than b");
        System.out.println("It is " + (a == b) + " that a is equal to b");

        float c = 4.0f;
        float d = 2.0f;

        double e = 4.0;
        double f = 2.0;

        System.out.println("Float sum " + (c + d));
        System.out.println("Float subtraction " + (c - d));
        System.out.println("Float multiplication " + (c * d));
        System.out.println("Float division " + (c / d));

        System.out.println("Double sum " + (e + f));
        System.out.println("Double subtraction " + (e - f));
        System.out.println("Double multiplication " + (e * f));
        System.out.println("Double division " + (e / f));

        System.out.println("It is " + (c > d) + " that c is greater than d");
        System.out.println("It is " + (c < d) + " that c is smaller than d");
        System.out.println("It is " + (c == d) + " that c is equal to d");

        System.out.println("It is " + (e > f) + " that e is greater than f");
        System.out.println("It is " + (e < f) + " that e is smaller than f");
        System.out.println("It is " + (e == f) + " that e is equal to f");
    }
}
