package OOPs;

//Calling parent constructor
class Animal2 {
    Animal2() {
        System.out.println("Animal constructor called");
    }
}

class Dog2 extends Animal2 {
    Dog2() {
        super(); // Calls the parent class constructor
        System.out.println("Dog constructor called");
    }
}

public class SuperKeyword_08 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
    }
}

