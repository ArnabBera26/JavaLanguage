/*
 In Java, a constructor is a special method used to initialize objects. It has the same name as the class and runs automatically when an object is created.

Types of Constructors
    Default Constructor – No parameters, assigns default values.
    Parameterized Constructor – Takes arguments to assign custom values.
 */
package OOPs;


class Car2 {
    String brand;

    //default constructor
    Car2(){
        brand="Unknown";
    }

    // Parameterized constructor
    Car2(String brandName) {
        brand = brandName;
    }

    void display() {
        System.out.println("Car Brand: " + brand);
    }
}

public class Oops_02 {
    public static void main(String[] args) {
        Car2 car1 = new Car2("Toyota"); // Calls parameterized constructor
        Car2 car2 = new Car2();    // Calls default constructor

        car1.display();
        car2.display();
    }
}
