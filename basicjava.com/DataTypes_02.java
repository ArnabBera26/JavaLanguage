/*
Non-Primitive Data Types (Reference types):
            String
            Arrays (int[], double[], etc.)
            Classes and Objects
            Interfaces
*/

// array and string 
public class DataTypes_02 {
    public static void main(String[] args) {
        String name = "Arnab";
        System.out.println(name);
        int[] arr = {1,2,3,45};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
