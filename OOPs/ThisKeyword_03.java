package OOPs;

//for calling instance variable
class Student {
    String name;

    Student(String name) {
        this.name = name; // `this` refers to the instance variable
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }
}

public class ThisKeyword_03 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        s1.display();
    }
}
