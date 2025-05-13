package OOPs;


// Parent class
class Animal5 {
    void eat() {
        System.out.println("Eating...");
    }
}

// Child class 1
class Dog5 extends Animal5 {
    void bark() {
        System.out.println("Barking...");
    }
}

// Child class 2
class Cat2 extends Animal5 {
    void meow() {
        System.out.println("Meowing...");
    }
}

// Main class
public class HierarchicalInheritance_11 {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        Cat2 cat = new Cat2();

        dog.eat();  // Inherited method
        dog.bark(); // Dog-specific method

        cat.eat();  // Inherited method
        cat.meow(); // Cat-specific method
    }
}

