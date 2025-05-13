package StringHandling;

public class StringPool_03 {
    public static void main(String[] args) {
        String s1 = "Hello";  // Stored in String Pool
        String s2 = "Hello";  // Reuses the same object from the Pool
        String s3 = new String("Hello"); // Creates a new object (not in the Pool)
        String s4 = s3.intern();

        System.out.println(s1 == s2);  // true (same object)
        System.out.println(s1 == s3);  // false (different objects)
        System.out.println(s3 == s4); // false 
    }
}

