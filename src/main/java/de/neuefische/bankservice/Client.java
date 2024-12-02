// Create a record 'Client' with the properties First Name, Last Name, and Customer
// Number (choose suitable English field names).

package de.neuefische.bankservice;

public record Client(String firstName, String lastName, int customerNumber) {
}
