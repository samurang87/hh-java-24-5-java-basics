package de.neuefische;

import de.neuefische.school.Course;
import de.neuefische.school.School;
import de.neuefische.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Max", "Mustermann", 1));
        students.add(new Student("John", "Snow", 2));
        students.add(new Student("Mario", "Rossi", 3));

        School school = new School(students);
        school.addStudent(new Student("Gina", "Mustermann", 4));
        school.showStudents();
        Student badStudent = school.getStudentByID(3);
        school.removeStudent(badStudent);
        System.out.println("----");
        school.showStudents();

        Student student1 = school.getStudentByID(1);
        student1.addCourse(new Course("Watercolor", "Jane Green", 1));
        System.out.println("Student 1 is taking " + school.getCoursesByStudentID(1));
    }
    }
