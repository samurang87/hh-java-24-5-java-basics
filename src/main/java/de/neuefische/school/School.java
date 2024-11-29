/*
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).

hashMap exercise
Step 1: Convert your application from the List lecture so that the School
Object uses a Hashmap instead of an ArrayList.

*/

package de.neuefische.school;

import java.util.HashMap;
import java.util.List;

public class School {
    private HashMap<Integer, Student> students;

    public School(List<Student> students) {
        for (Student student : students) {
            this.students.put(student.getId(), student);
        }
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void showStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public Student getStudentByID(int id) {
        Student student = students.get(id);
        if (student == null) {
            throw new IllegalArgumentException("Student with ID " + id + " not found");
        }
        return student;
    }

    public void removeStudent(Student student) {
        students.remove(student.getId());
    }

    public List<Course> getCoursesByStudentID(int id) {
        Student student = getStudentByID(id);
        return student.getCourses();
    }
}
