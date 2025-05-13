package Operator;

public class Bitwise_04 {
    public static void main(String[] args) {
        int a = 5, b = 3;

        System.out.println("Bitwise AND (&): " + (a & b));  // Output: 1
        System.out.println("Bitwise OR (|): " + (a | b));   // Output: 7
        System.out.println("Bitwise XOR (^): " + (a ^ b));  // Output: 6
        System.out.println("Bitwise Complement (~a): " + (~a)); // Output: -6

        System.out.println("Left Shift (<<): " + (a << 1)); // Output: 10
        System.out.println("Right Shift (>>): " + (a >> 1)); // Output: 2
        System.out.println("Unsigned Right Shift (>>>): " + (-5 >>> 1)); // Output: large positive number
    }
}
