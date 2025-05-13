package OOPs;

//Accessing Parent Class Instance Variables
class Animal {
    String type = "Mammal";
}

class Dog extends Animal {
    String type = "Pet";

    void displayType() {
        System.out.println("Dog Type: " + type); // Refers to subclass variable
        System.out.println("Animal Type: " + super.type); // Refers to parent variable
    }
}

public class SuperKeyword_06 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.displayType();
    }
}


