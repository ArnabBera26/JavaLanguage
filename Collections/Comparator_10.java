package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Student class with multiple sorting criteria
class Student2 {
    int id;
    String name;

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

// Comparator for sorting students by ID
class SortById implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.id - s2.id; // Ascending order
    }
}

// Comparator for sorting students by Name
class SortByName implements Comparator<Student2> {
    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.name.compareTo(s2.name); // Alphabetical order
    }
}

public class Comparator_10 {
    public static void main(String[] args) {
        ArrayList<Student2> students = new ArrayList<>();
        students.add(new Student2(3, "Alice"));
        students.add(new Student2(1, "Bob"));
        students.add(new Student2(2, "Charlie"));

        // Sorting by ID
        Collections.sort(students, new SortById());
        System.out.println("Sorted by ID:");
        for (Student2 student : students) {
            System.out.println(student);
        }

        // Sorting by Name
        Collections.sort(students, new SortByName());
        System.out.println("\nSorted by Name:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}


