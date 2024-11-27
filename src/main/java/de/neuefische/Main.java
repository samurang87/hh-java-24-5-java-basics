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

    }
    }
