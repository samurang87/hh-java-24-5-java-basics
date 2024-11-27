/*
Lege dir eine Klasse "CarInspectionService" an.
Es sollte für jede kommende Methode ein Test geschrieben werden.
Schreibe jeweils erst einen Test und dann die Funktionalität (wenn du dich damit wohlfühlst).

Schreibe eine Methode die als Parameter Car entgegennimmt und ein boolean zurückgibt.
Diese Methode soll überprüfen, ob das Car 4 Reifen hat.
Schreibe eine Methode die als Parameter ein Car entgegennimmt und ein boolean zurückgibt.
Diese Methode soll überprüfen, ob der Car einen seatBelt besitzt.
Schreibe eine Methode die als Parameter ein Car entgegennimmt und ein boolean zurückgibt.
Diese Methode soll überprüfen, ob der Car einen airbag besitzt.
Schreibe eine Methode die als Parameter ein Car entgegennimmt und ein boolean zurückgibt.
Diese Methode soll überprüfen, ob der Car entweder 3 oder 5 Türen besitzt.
Schreibe eine Methode checkCar, die alle anderen Methoden aufruft und nur true
zurückgeben darf, wenn alle Checks positiv sind.
 */

package de.neuefische.tuvprufung;

public class CarInspectionService {

    public static boolean carHas4Tires(Car car) {
        return car.getNumberOfTires() == 4;
    }

    public static boolean carHasSeatbelt(Car car) {
        return car.hasSeatBelt();
    }

    public static boolean carHasAirbag(Car car) {
        return car.hasAirbag();
    }

    public static boolean carHasAllowedNumberOfDoors(Car car) {
        return (car.getNumberofDoors() == 3  || car.getNumberofDoors() == 5);
    }

    public static boolean checkCar(Car car) {
        return carHas4Tires(car) && carHasSeatbelt(car) && carHasAirbag(car) && carHasAllowedNumberOfDoors(car);
    }
}
