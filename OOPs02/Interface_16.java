package OOPs02;

//basic inetrface
// Defining an interface
interface Animal2 {
    void makeSound(); // Abstract method (no implementation)
}

// Implementing the interface
class Dog2 implements Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

public class Interface_16 {
    public static void main(String[] args) {
        Animal2 myDog = new Dog2(); // Polymorphism
        myDog.makeSound();
    }
}


