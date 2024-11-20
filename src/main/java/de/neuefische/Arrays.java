package de.neuefische;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // we have the option to define them in two ways
        // 1. directly with the values
        int[] numbers = {1, 2, 3, 4, 5};
        // 2. first with the length and then the values
        int[] numbers2 = new int[5];
        numbers2[0] = 6;
        numbers2[1] = 7;
        numbers2[2] = 8;
        numbers2[3] = 9;
        numbers2[4] = 10;

        // We can fill them in with a for loop
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers2[i] + " ");
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers2[i] + " ");
        }

        // The for-each loop is another way to write them, in case we don't need the index
        // (e.g. we don't need manipulations)
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        // Write a 2x2 matrix
        int[][] multinumber = new int[5][5];
        multinumber[0][0] = 1;
        multinumber[0][1] = 2;
        multinumber[1][0] = 3;
        multinumber[1][1] = 4;

        // Loop through it
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(multinumber[i][j] + " ");
            }
        }

        // Also with the for-each loop
        for (int[] j : multinumber) {
            for (int k : j) {
                System.out.print(k + " ");
            }
        }

        // Write an array with numbers from 1 to ten and print
        int[] ten = new int[10];
        for (int i = 0; i < ten.length; i++) {
            ten[i] = i + 1;
            System.out.print(ten[i] + " ");
        }
        System.out.println();

        // Calculate the sum and print to console
        int sumNumbers = 0;
        for (int i = 0; i < ten.length; i++) {
            sumNumbers += ten[i];
        }
        System.out.println(sumNumbers);

        // Find the largest number in the array and print to console
        int largest = ten[0];
        for (int number : ten) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);

        // Create a second array with numbers from 11 to 20
        int[] twenty = new int[10];
        for (int i = 0; i < 10; i++) {
            twenty[i] = i + 11;
            System.out.print(twenty[i] + " ");
        }
        System.out.println();

        // Perform element-wise addition of both arrays and store the result in a third array.
        // Print the result array to the console.
        int[] eAddition = new int[10];
        for (int i = 0; i < eAddition.length; i++) {
            eAddition[i] = ten[i] + twenty[i];
            System.out.print(eAddition[i] + " ");
        }

        System.out.println();

        // Get text from the console and print
        splitInput();
    }

    public static void splitInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter some text: ");
        String text = scanner.nextLine();
        char[]inputs = text.toCharArray();
        for (int i = 0; i < inputs.length; i++) {
            System.out.println(inputs[i]);
        }
    }
}
