/*
Expand the Java-List project with a class called "Course" that has the following properties: course name, instructor, room.
Add a method to the Student class to add courses to the student (courses in which the student is participating).
Implement a method within the School class to retrieve all courses of a specific student (based on a student ID).
*/

package de.neuefische.school;

public class Course {
    private String name;
    private String instructor;
    private int room;

    public Course(String name, String instructor, int room) {
        this.name = name;
        this.instructor = instructor;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return name + " taught by " + instructor + " in room " + room;
    }
}
