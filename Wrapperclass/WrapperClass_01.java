package Wrapperclass;

public class WrapperClass_01 {
    public static void main(String[] args) {
        // Primitive types
        int primitiveInt = 10;

        // Wrapping (Boxing)
        Integer wrappedInt = Integer.valueOf(primitiveInt);

        // Unwrapping (Unboxing)
        int unwrappedInt = wrappedInt.intValue();

        // Auto-boxing and unboxing
        Integer autoBoxed = primitiveInt; // Automatically converts primitive to wrapper
        int autoUnboxed = autoBoxed; // Automatically converts wrapper to primitive

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapped (Boxed): " + wrappedInt);
        System.out.println("Unwrapped: " + unwrappedInt);
        System.out.println("Auto-boxed: " + autoBoxed);
        System.out.println("Auto-unboxed: " + autoUnboxed);
    }
}


