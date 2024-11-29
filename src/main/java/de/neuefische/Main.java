package de.neuefische;

import de.neuefische.pharmacy.Medication;
import de.neuefische.pharmacy.Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        pharmacy.save(new Medication("Imodium", 1.99, 100));
        pharmacy.save(new Medication("Tantum Verde", 3.99, 150));
        pharmacy.save(new Medication("Aspirin", 4.99, 200));

        pharmacy.printMedicationCatalogue();

        pharmacy.delete("Aspirin");
        System.out.println(pharmacy.find("Aspirin"));
        System.out.println("Ran out of Aspirin! What is left?");

        pharmacy.printMedicationCatalogue();
    }
    }
