package OOPs;

//calling another constructor
class Car3 {
    String brand;
    int year;

    Car3() {
        this("Toyota", 2023); // Calls the parameterized constructor
    }

    Car3(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

public class ThisKeyWord_04 {
    public static void main(String[] args) {
        Car3 car1 = new Car3(); // Calls default constructor, which invokes another constructor
        car1.display();
    }
}

