package de.neuefische;

public class SimpleCar {

    /*
    Step 1: Define the properties of a car, e.g. 'Brand', 'Model', 'Color', 'Year of Manufacture', etc.
    Step 2: Implement a method that "starts" the car and outputs a message.
    Step 3: Create an object of the class 'Car' and call the method to start it.
    Step 4: Extend the class 'Car' with a property 'Speed' and a method that "accelerates" the car and changes the speed.
    Step 5: Create a second object of the class 'Car', accelerate it, and display the speed.
    If you have already completed this task earlier, you may work on the bonus task on the next page.
    * */
    String brand;
    String model;
    String color;
    int year;
    boolean electric;
    int speed;

    public void start() {
        System.out.println("Car started");
    }

    public void accelerate(int delta) {
        this.speed += delta;
    }
}
