package OOPs;


class Animal4 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Mammal extends Animal4 {
    void walk() {
        System.out.println("Walking...");
    }
}

class Dog4 extends Mammal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class MultiLevelInheritance_10 {
    public static void main(String[] args) {
        Dog4 dog = new Dog4();
        dog.eat();  // Inherited from Animal
        dog.walk(); // Inherited from Mammal
        dog.bark(); // Own method
    }
}

