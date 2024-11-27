package de.neuefische;


public class Vehicle {

    private final String manufacturer;
    private final String model;
    private final int year;

    public Vehicle(String manufacturer, String model, int year) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void outputVehicleInfo() {
        System.out.println("Manufacturer: " + manufacturer + "\nModel: " + model + "\nYear: " + year);
    }
}
