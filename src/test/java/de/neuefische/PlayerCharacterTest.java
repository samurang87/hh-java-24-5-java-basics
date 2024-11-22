package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlayerCharacterTest {

    @Test
    void return0_atStart() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        int x = playerCharacter.getX();
        Assertions.assertEquals(0, x);
    }

    @Test
    void increaseY_whenUp() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        char direction = 'W';
        playerCharacter.move(direction);
        Assertions.assertEquals(1, playerCharacter.getY());
    }

    @Test
    void decreaseY_whenDown() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        char direction = 'S';
        playerCharacter.move(direction);
        Assertions.assertEquals(-1, playerCharacter.getY());
    }

    @Test
    void increaseX_whenRight() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        char direction = 'D';
        playerCharacter.move(direction);
        Assertions.assertEquals(1, playerCharacter.getX());
    }

    @Test
    void decreaseX_whenLeft() {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        char direction = 'A';
        playerCharacter.move(direction);
        Assertions.assertEquals(-1, playerCharacter.getX());
    }
}