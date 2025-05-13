package OOPs02;

//mutiple interface 

// Interface 1
interface Flyable {
    void fly();
}

// Interface 2
interface Eatable {
    void eat();
}

// Class implementing multiple interfaces
class Bird implements Flyable, Eatable {
    @Override
    public void fly() {
        System.out.println("Bird flies high!");
    }

    @Override
    public void eat() {
        System.out.println("Bird eats grains.");
    }
}

public class Interface_17 {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.fly();
        myBird.eat();
    }
}



