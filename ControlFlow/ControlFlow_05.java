package ControlFlow;

//continue statement
public class ControlFlow_05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // Skips even numbers
            }
            System.out.println("Odd number: " + i);
        }
    }
}
