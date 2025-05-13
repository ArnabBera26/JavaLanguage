package Exceptions;

// try catch finally
public class Exception_01 {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0; // Division by zero exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program continues...");
    }
}


