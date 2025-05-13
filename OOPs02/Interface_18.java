package OOPs02;

//default and static method inside interface 

interface Vehicle2 {
    default void honk() {
        System.out.println("Vehicle honks!");
    }

    static void showInfo() {
        System.out.println("All vehicles have wheels.");
    }
}

class Car2 implements Vehicle2 {}

public class Interface_18 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();
        myCar.honk(); // Calls default method

        Vehicle2.showInfo(); // Calls static method
    }
}


