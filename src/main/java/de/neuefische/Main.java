package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        counter1.incrementInstanceCount();
        counter2.incrementInstanceCount();
        counter3.incrementInstanceCount();

        counter1.incrementInstanceCount();
        Counter.incrementTotalCount();

        System.out.println(Counter.getTotalCount());
        System.out.println(counter1.getInstanceCount());

        System.out.println(Counter.add(12, 87));
        System.out.println(Counter.subtract(100, 1));
        System.out.println(Counter.multiply(9, 11));
        System.out.println(Counter.divide(198, 2));
    }
    }
