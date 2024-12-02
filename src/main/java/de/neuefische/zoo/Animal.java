// Create a Java record "Animal" that should have properties
// for ID, Name, Species, and Age. Choose suitable field names.

package de.neuefische.zoo;

public record Animal(int id, String name, Species species, int age, Owner owner) {
}
