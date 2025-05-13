/*
 * Explicit Type Casting (Narrowing)
        Requires manual conversion.
        Data loss may occur when converting from a larger data type to a smaller one.
 */
public class TypeCasting_07 {
    public static void main(String[] args) {
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // Explicit casting from double to int
        System.out.println("Double: " + doubleValue);
        System.out.println("Integer: " + intValue);
    }
}
