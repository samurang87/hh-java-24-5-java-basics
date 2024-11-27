package de.neuefische;

public class Person {
    String name;
    int age;
    char gender;
    boolean married;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, I am " + this.name + " and am " + this.age + " years old.");
    }
}
