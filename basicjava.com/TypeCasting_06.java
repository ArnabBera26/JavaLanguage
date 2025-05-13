/*
There are two types of typecasting in java :

Implicit Type Casting (Widening)
         Occurs automatically when converting a smaller data type into a larger data type.
        No data loss.
 */
public class TypeCasting_06 {

    public static void main(String[] args) {
         int num = 100;
        double doubleNum = num; // Implicit casting from int to double
        System.out.println("Integer: " + num);
        System.out.println("Double: " + doubleNum);
    }
}