package Collections;

import java.util.ArrayList;
import java.util.Collections;

// Implementing Comparable in a class
class Student implements Comparable<Student> {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Implement compareTo method (sorting by ID)
    @Override
    public int compareTo(Student other) {
        return this.id - other.id; // Ascending order
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Comparable_09 {
    public static void main(String[] args) {
        // Creating a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice"));
        students.add(new Student(1, "Bob"));
        students.add(new Student(2, "Charlie"));

        // Sorting the list using Comparable
        Collections.sort(students);

        // Displaying the sorted list
        for (Student student : students) {
            System.out.println(student);
        }
    }
}