/*
    There are mainly 3 typesf  of variable in java 
        Local Variable – Defined inside a method or block, accessible only within that scope.
        Instance Variable – Declared inside a class but outside any method, belongs to an object.
        Static Variable – Declared inside a class with the static keyword, shared among all instances of the class.
 */
public class Variable_05 {
        
    // Instance variable (belongs to an object)
    int instanceVar = 10;

    // Static variable (shared across all instances)
    static int staticVar = 50;

    public static void main(String[] args) {
        // Local variable (exists only within this method)
        int localVar = 20;

        // Creating an object to access instance variable
        Variable_05 obj = new Variable_05();
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Local Variable: " + localVar);
    }
}
