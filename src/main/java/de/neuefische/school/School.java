/*
Step 3: Create a class "School" to which students can be added through a method ('addStudent').
Step 4: Implement a method to print all students of the school (as text, to the console).
*/

package de.neuefische.school;

import java.util.List;

public class School {
    private List<Student> students;

    public School(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student getStudentByID(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("Student with id " + id + " not found");
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Course> getCoursesByStudentID(int id) {
        Student student = getStudentByID(id);
        return student.getCourses();
    }
}
