package OOPs;

//compile time polymorphism
class MathOperations {
    // Overloaded methods (same name, different parameters)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism_12 {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Addition (int): " + math.add(5, 10));
        System.out.println("Addition (double): " + math.add(5.5, 10.2));
    }
}

