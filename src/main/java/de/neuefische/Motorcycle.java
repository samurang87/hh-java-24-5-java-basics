package de.neuefische;

public class Motorcycle extends Vehicle {
    private String type;

    public Motorcycle(String manufacturer, String model, int year, String type) {
        super(manufacturer, model, year);
        this.type = type;
    }

    @Override
    public void outputVehicleInfo() {
        super.outputVehicleInfo();
        System.out.println("Type: " + this.type);
    }
}
