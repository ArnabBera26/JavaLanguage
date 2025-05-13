/*
  Java has two main categories of data types:
        1)primitive (8 types)
        2) non-primitive
 */

//primitive data types
public class DataTypes_01 {
    public static void main(String[] args) {
        // Integer types
        byte byteValue = 127;     // Range: -128 to 127
        short shortValue = 32000; // Range: -32,768 to 32,767
        int intValue = 100000;    // Range: -2^31 to 2^31-1
        long longValue = 10000000000L; // Range: -2^63 to 2^63-1

        // Floating-point types
        float floatValue = 3.14f;  // Approximate precision: 6-7 decimal places
        double doubleValue = 3.141592653589793; // Approximate precision: 15 decimal places

        // Character type
        char charValue = 'A'; // Stores a single character

        // Boolean type
        boolean booleanValue = true; // Can be true or false

        // Print values
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);
    
    }
    
}