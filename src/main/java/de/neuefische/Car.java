package de.neuefische;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void outputVehicleInfo() {
        super.outputVehicleInfo();
        System.out.println("Doors: " + this.numberOfDoors);
    }
}
