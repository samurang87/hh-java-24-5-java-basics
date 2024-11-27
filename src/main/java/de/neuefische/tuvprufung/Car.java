package de.neuefische.tuvprufung;

/*
Lege dir eine neue Klasse mit dem Namen Car und den Feldern :
numberOfTires (int)
numberOfDoors (int)
seatBelt (boolean)
airbag (boolean)
Lege dir die getter-, setter- ,equals-,hashcode- und die ToString- Methoden an.
Lege dir einen default constructor und einen mit allen Feldern/Eigenschaften an.
 */

import java.util.Objects;

public class Car {

    private int numberOfTires;
    private int numberofDoors;
    private boolean seatBelt;
    private boolean airbag;

    public Car(int numberOfTires, int numberofDoors, boolean seatBelt, boolean airbag) {
        this.numberOfTires = numberOfTires;
        this.numberofDoors = numberofDoors;
        this.seatBelt = seatBelt;
        this.airbag = airbag;

    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public int getNumberofDoors() {
        return numberofDoors;
    }

    public void setNumberofDoors(int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }

    public boolean hasSeatBelt() {
        return seatBelt;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public boolean hasAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airBag) {
        this.airbag = airBag;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberofDoors=" + numberofDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTires == car.numberOfTires && numberofDoors == car.numberofDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numberofDoors, seatBelt, airbag);
    }
}
