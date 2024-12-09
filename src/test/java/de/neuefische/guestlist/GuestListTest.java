package de.neuefische.guestlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GuestListTest {

    @Test
    /*
    Test 1:
    Write a test shouldBeEmptyInitially that
    - creates an instance of the GuestList class
    - calls the setGuests method with an empty list
    - then calls getGuests (the result should be a list of strings) and checks that
      the result is an empty list
     */

    void shouldBeEmptyInitially() {
        GuestList guestList = new GuestList();
        guestList.setGuests(new ArrayList<>());
        List<String> result = guestList.getGuests();
        Assertions.assertEquals(new ArrayList<>(), result);
    }
}
