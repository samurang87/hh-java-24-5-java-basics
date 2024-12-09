/*
Step 1: Write code to output the current date and time.
Step 2: Add a timespan of 2 weeks to the current date and output the new date.
Step 3: Compare the current date with a specified future date and output whether
the current date is before or after the specified date.
Step 4: Calculate the difference in days between two arbitrary dates and output
the result.
*/

package de.neuefische.timeplayground;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TimePlayground {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now.plusWeeks(2));

        LocalDateTime otherDate = LocalDateTime.of(2025, 1, 1, 0, 0);
        if (now.isBefore(otherDate)) {
            System.out.println(now + " is before " + otherDate);
        } else {
            System.out.println(now + " is after " + otherDate);
        }

        LocalDateTime start = LocalDateTime.of(2025, 1, 1, 0, 0);
        LocalDateTime end = LocalDateTime.of(2025, 1, 15, 0, 0);
        System.out.println(ChronoUnit.HOURS.between(start, end) + " hours between " + start + " and " + end);
    }
}
