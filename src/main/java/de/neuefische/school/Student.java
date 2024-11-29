/*
Step 1: Create a Java class "Student" that should have the following properties: First name, Last name, Student ID.
Step 2: Create a Java List for elements of type "Student" and add multiple students.
* */

package de.neuefische.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int studentID;
    private List<Course> courses;

    public Student(String firstName, String lastName, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.courses = new ArrayList<>();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " [" + studentID + "]";
    }

    public int getId() {
        return studentID;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentID);
    }
}
