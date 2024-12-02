// Implement a "Zoo" Record that has a list of all Animals and can calculate the
// total food requirement of all animals in the Zoo.

package de.neuefische.zoo;

import java.util.List;

public record Zoo(List<Animal> animals) {

    public int totalFoodRequirementInGramsPerDay() {
        int totalFoodRequirement = 0;
        for (Animal animal : animals) {
            totalFoodRequirement += animal.species().foodRequirementInGramsPerDay();
        }
        return totalFoodRequirement;
    }
}
