package Operator;

public class Logical_03 {
 public static void main(String[] args) {
    
        boolean condition1 = (10 > 5); // true
        boolean condition2 = (5 < 2);  // false

        System.out.println("Logical AND (&&): " + (condition1 && condition2)); // false
        System.out.println("Logical OR (||): " + (condition1 || condition2)); // true
        System.out.println("Logical NOT (!): " + (!condition1)); // false
    }
}


