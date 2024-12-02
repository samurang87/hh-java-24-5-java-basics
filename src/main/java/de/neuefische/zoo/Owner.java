// Create an Owner Record that stores some properties of a pet owner (Name, Age, Address).
//Let each Animal have an Owner.

package de.neuefische.zoo;

public record Owner(String name, int age, String address) {
}
