package de.neuefische;

import de.neuefische.zoo.Animal;
import de.neuefische.zoo.Owner;
import de.neuefische.zoo.Species;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal fox = new Animal(
                1,
                "Foxy",
                new Species("Fox", 100),
                3, new Owner("Max Mustermann", 38, "Berlin"),
                LocalDate.of(2023, 3, 15));

        System.out.println(fox.daysUntilBirthday() + " days until " + fox.name() + "'s birthday");
    }
    }
