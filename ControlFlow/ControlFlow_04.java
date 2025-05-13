package ControlFlow;

// break statement
public class ControlFlow_04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop stopped at i = " + i);
                break;  // Exits the loop immediately
            }
            System.out.println("Iteration: " + i);
        }
    }
}
