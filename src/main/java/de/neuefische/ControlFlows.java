package de.neuefische;

public class ControlFlows {

    public static void main(String[] args) {

        int age = 18;
        int age2 = 39;

        boolean res = isPersonOfAge(age);
        System.out.println(res);
        isPersonOfAge(age2);

        System.out.println(add(age, age2));
        System.out.println(subtract(age2, age));

        int negNumber = -19;
        System.out.println(makePositive(negNumber));

        int a = 5;
        int b = 2;

        if (a > b) {
            System.out.println(subtract(a, b));
        } else {
            System.out.println(add(a, b));
        }

        System.out.println(returnEvenOrDouble(201));

        System.out.println(isPalindrome("Itopinonavevanonipoti"));
    }

    public static boolean isPersonOfAge(int age) {
        if (age > 18) {
            System.out.println("Ja, die Person ist über 18 Jahre alt");
            return true;
        } else if (age == 18) {
            System.out.println("Ja, die Person ist genau 18 Jahre alt");
            return true;
        } else {
            System.out.println("Nein, die Person ist nicht über 18 Jahre alt");
            return false;
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double makePositive(double a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }

    public static double returnEvenOrDouble(double number) {
        if (number % 2 == 0) {
            return number;
        } else {
            return number * 2;
        }
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
