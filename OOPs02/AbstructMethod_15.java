package OOPs02;

abstract class Vehicle {
    abstract void start(); // Must be implemented by subclass
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}


public class AbstructMethod_15 {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
    }
}
