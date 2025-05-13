/*
  In Java, a class is a blueprint that defines the attributes (fields) and behaviors (methods) of objects.
  An object is an instance of a class, created using the new keyword.
 */
package OOPs;

// Defining a class
class Car {
    // Attributes (instance variables)
    String brand;
    int year;

    // Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    void displayInfo() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

// Main class to create objects
public class Oops_01 {
    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", 2022);
        Car car2 = new Car("Honda", 2020);

        // Calling method to display details
        car1.displayInfo();
        car2.displayInfo();
    }
}


