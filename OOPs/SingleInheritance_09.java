package OOPs;

// Parent class
class Animal3 {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class inheriting from Animal
class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Barking...");
    }
}

// Main class
public class SingleInheritance_09 {
    public static void main(String[] args) {
        Dog3 dog = new Dog3();
        dog.eat();  // Inherited method
        dog.bark(); // Own method
    }
}

