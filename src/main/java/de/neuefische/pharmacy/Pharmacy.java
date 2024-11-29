package de.neuefische.pharmacy;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> store;

    public Pharmacy() {
        store = new HashMap<>();
    }

    public int getCount() {
        return store.size();
    }

    public void save(Medication medication) {
        store.put(medication.getName(), medication);
    }

    public Medication find(String name) {
        return store.get(name);
    }

    public void delete(String name) {
        store.remove(name);
    }

    public void printMedicationCatalogue() {
        for (Medication medication : store.values()) {
            System.out.println(medication);
        }
    }
}


