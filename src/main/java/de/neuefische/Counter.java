/*

Exercise 1
Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.
Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.
Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.
Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.
Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.

Exercise 2
Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.
Write code in the main method to call the 'add' method and print the result.
Optional: Implement additional static methods in the 'Calculator' class (subtraction, multiplication, division) and call them in the main method.
*/

package de.neuefische;

public class Counter {
    private static int totalCount = 0;
    private int instanceCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    public int getInstanceCount() {
        return instanceCount;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public static double add(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double divide(double first, double second) {
        return first / second;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
