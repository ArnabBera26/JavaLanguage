package OOPs;

//Calling Parent Class Methods
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
        super.makeSound(); // Calls the parent method
    }
}

public class SuperKeyword_07 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}

