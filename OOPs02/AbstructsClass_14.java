package OOPs02;


abstract class Animal {
    abstract void makeSound(); // Abstract method (must be implemented in child class)

    void sleep() { // Regular method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstructsClass_14 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Calls implemented method
        myDog.sleep();  // Calls non-abstract method
    }
}

