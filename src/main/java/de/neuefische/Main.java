package de.neuefische;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello hh-java-24-5!!!");

        int zahl1, zahl2, zahl3;
        zahl1 = 1;
        zahl2 = 2;
        zahl3 = 3;
        int zahl4 = 4;
        System.out.println(zahl4);

        // Primitive Datentypen
        // int (32 bit)
        // boolean (true, false)
        // double (46 bit)
        // float (32 bit)
        // char (Unicode character, 16 bit),
        // long (64 bit)
        // short (16 bit)
        // byte (8 bit)

        // Komplexe Datentypen
        // String (Zeichenkette - eine Anreihung von Chars)

        int summe = zahl1 + zahl3;
        int minus = zahl3 - zahl4;
        int mult = zahl2 * zahl4;
        double div = zahl3 / (double) zahl1;
        int modulo = zahl3 % zahl2;  // Restdivision

        System.out.println(summe);
        System.out.println(minus);
        System.out.println(mult);
        System.out.println(div);
        System.out.println(modulo);

        boolean istZahl1GroesserAlsZahl3 = zahl1 > zahl3;
        boolean istZahl1GroesserGleichAls3 = zahl1 >= zahl3;
        boolean istZahl1KleinerAlsZahl3 = zahl1 < zahl3;
        boolean istZahl1KleinerGleichAlsZahl3 = zahl1 <= zahl3;
        boolean istZahl1GleichZahl3 = zahl1 == zahl3;
        System.out.println("It is " + istZahl1GroesserAlsZahl3 + " that Zahl1 is bigger than Zahl3");
        System.out.println("It is " + istZahl1GroesserGleichAls3 + " that Zahl1 is greater or equal than Zahl3");
        System.out.println("It is " + istZahl1KleinerAlsZahl3 + " that Zahl1 is lower than Zahl3");
        System.out.println("It is " + istZahl1KleinerGleichAlsZahl3 + " that Zahl1 is lower or equal than Zahl3");
        System.out.println("It is " + istZahl1GleichZahl3 + " that Zahl1 is equal to Zahl3");
        System.out.println(istZahl1GleichZahl3 || istZahl1GroesserAlsZahl3);
        System.out.println(istZahl1GroesserGleichAls3 && istZahl1GroesserAlsZahl3);
    }
}
