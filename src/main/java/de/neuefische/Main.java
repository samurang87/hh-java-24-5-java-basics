package de.neuefische;

import de.neuefische.zoo.Animal;
import de.neuefische.zoo.Owner;
import de.neuefische.zoo.Species;
import de.neuefische.zoo.Zoo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Owner birdOwner = new Owner("Max Mustermann", 31, "Panda Street");


        Species chicken = new Species("Chicken", 100);
        Animal niwatori = new Animal(1, "Niwatori", chicken, 5, birdOwner);
        Animal gallina = new Animal(2, "Gallina", chicken, 1, birdOwner);
        Animal hahn = new Animal(3, "Hahn", chicken, 3, birdOwner);
        System.out.println(birdOwner.name() + " owns 3 chicken: " + niwatori.name() + ", " + gallina.name() + ", and " + hahn.name() + ".");

        Owner predatorOwner = new Owner("John Doe", 45, "Lion Street");
        Species fox = new Species("Fox", 200);
        Animal kitsune = new Animal(2, "Kitsune", fox, 3, predatorOwner);
        System.out.println(kitsune);

        Species wolf = new Species("Wolf", 3000);
        Animal ookami = new Animal(3, "Ookami", wolf, 7, predatorOwner);
        System.out.println(ookami);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(niwatori);
        animals.add(gallina);
        animals.add(hahn);
        animals.add(kitsune);
        animals.add(ookami);

        Zoo zoo = new Zoo(animals);
        System.out.println("The total food requirement of all animals in the zoo is " + zoo.totalFoodRequirementInGramsPerDay() + " grams per day.");
    }
    }
