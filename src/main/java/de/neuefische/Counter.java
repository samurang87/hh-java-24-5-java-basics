/*
* Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.

Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.

Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.

Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.

Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.

Please post here the link to a GitHub repo where you have solved this task together.*/

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

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
