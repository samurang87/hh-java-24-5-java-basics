package de.neuefische.guestlist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GuestList {
    private List<Guest> guests;

    public GuestList() {
        this.guests = new ArrayList<>();
    }

    public void setGuests(List<String> names) {
        for (String name : names) {
            guests.add(new Guest(name));
        }
    }

    public List<String> getGuests() {
        return guests.stream().map(Guest::name).collect(Collectors.toList());
    }
}
