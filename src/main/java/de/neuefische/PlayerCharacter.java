package de.neuefische;

public class PlayerCharacter {
    private int x = 0;
    private int y = 0;

    public void move(char direction) {
        switch (direction) {
            case 'W' -> y++;
            case 'S' -> y--;
            case 'A' -> x--;
            case 'D' -> x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
