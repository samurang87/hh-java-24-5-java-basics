// Create a Species Record that stores the properties of an animal species
// (Name, Food requirement in grams per day).
//Let each Animal have a Species.
//In your main method, let multiple Animal objects have the same Species.

package de.neuefische.zoo;

public record Species(String name, int foodRequirementInGramsPerDay) {
}
