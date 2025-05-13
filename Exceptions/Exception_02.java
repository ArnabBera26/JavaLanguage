package Exceptions;

// throw keyword
public class Exception_02 {
    public static void main(String[] args) {
        try {
            validateAge(15); // Throws an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method throwing an exception manually
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above");
        }
        System.out.println("Valid Age");
    }
}
