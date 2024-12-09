// Create a Java record "Animal" that should have properties
// for ID, Name, Species, and Age. Choose suitable field names.

package de.neuefische.zoo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public record Animal(int id, String name, Species species, int age, Owner owner, LocalDate birthday) {

    public long daysUntilBirthday() {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(
                now.getYear(),
                this.birthday.getMonth(),
                this.birthday.getDayOfMonth());
        if (now.isAfter(birthday)) {
            birthday = birthday.plusYears(1);
        }
        return ChronoUnit.DAYS.between(now, birthday);
    }
}
