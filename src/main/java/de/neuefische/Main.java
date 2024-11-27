package de.neuefische;

public class Main {
    public static void main(String[] args) {


        Vehicle truck = new Vehicle("Iveco", "BigOne", 2011);
        Car car = new Car("Ferrari", "Red", 2022, 2);
        Motorcycle vespa = new Motorcycle("Vespa", "Special", 2024, "Scooter");

        truck.outputVehicleInfo();
        car.outputVehicleInfo();
        vespa.outputVehicleInfo();
    }
    }
