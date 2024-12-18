/*
Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice',
and 'getAvailability'.
Step 2: Create a Java class 'Pharmacy' that uses a Java Map to store the Medication
name as the key and its information as the value.
Step 3: Create a method 'int getCount()' in the class Pharmacy.
This method should return the number of Medications in the pharmacy.
Step 4: Create a method 'void save(Medication medication)' in the class Pharmacy.
This method should insert the Medication indexed by its name into the pharmacy.
Step 5: Create a method 'Medication find(String medicationName)' in the class Pharmacy.
This method should return the requested Medication with this name.
If no Medication with this name is found, the method should return null.
Step 6: Create a method 'void delete(String medicationName)' in the class Pharmacy.
This method should delete the Medication with this name.
Step 7: Implement a method to print all Medications in the map, including their name,
price, and availability.
* */

package de.neuefische.pharmacy;

import java.util.Objects;

public class Medication {
    private final String name;
    private double price;
    private int availability;

    public Medication(String name, double price, int availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }
}
