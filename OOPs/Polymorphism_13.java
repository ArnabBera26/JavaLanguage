package OOPs;
//rumtime polymorphism
class Animal6 {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog6 extends Animal6 {
    // Overriding the parent method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Polymorphism_13 {
    public static void main(String[] args) {
        Animal6 myAnimal = new Dog6(); // Polymorphic reference
        myAnimal.makeSound(); // Calls overridden method
    }
}
