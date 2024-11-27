package de.neuefische.tuvprufung;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CarInspectionServiceTest {

    @ParameterizedTest
    @CsvSource({"4, true", "3, false"}
    )
    void wheelsInspectionTest(int numberOfTires, boolean expected) {
        Car car = new Car(numberOfTires, 2, true, true);
        Assertions.assertEquals(expected, CarInspectionService.carHas4Tires(car));
    }

    @ParameterizedTest
    @CsvSource({"true, true", "false, false"})
    void hasSeatbeltTest(boolean seatbelt, boolean expected) {
        Car car = new Car(4, 2, seatbelt, true);
        Assertions.assertEquals(expected, CarInspectionService.carHasSeatbelt(car));
    }

    @ParameterizedTest
    @CsvSource({"true, true", "false, false"})
    void hasAirbagTest(boolean airbag, boolean expected) {
        Car car = new Car(4, 2, true, airbag);
        Assertions.assertEquals(expected, CarInspectionService.carHasAirbag(car));
    }

    @ParameterizedTest
    @CsvSource({"3, true", "5, true", "1, false"})
    void hasAllowedNumberOfDoors(int numberOfDoors, boolean expected){
        Car car = new Car(4, numberOfDoors, true, true);
        Assertions.assertEquals(expected, CarInspectionService.carHasAllowedNumberOfDoors(car));
    }

    @ParameterizedTest
    @CsvSource({
            "4, 3, true, true, true",
            "3, 3, true, true, false",
            "4, 2, true, true, false",
            "4, 3, false, true, false",
            "4, 3, true, false, false"})
    void carPassesAllChecks(int numberOfTires, int numberOfDoors, boolean seatbelt, boolean airbag, boolean expected) {
        Car car = new Car(numberOfTires, numberOfDoors, seatbelt, airbag);
        Assertions.assertEquals(expected, CarInspectionService.checkCar(car));
    }
}

