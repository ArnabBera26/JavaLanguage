package InnerClass;

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExprassion_05 {
    public static void main(String[] args) {
        // Using lambda expressions to implement the interface
        MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operation(5, 3));
        System.out.println("Multiplication: " + multiplication.operation(5, 3));
    }
}

