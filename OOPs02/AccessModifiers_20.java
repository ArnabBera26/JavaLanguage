package OOPs02;

class AccessExample {
    private int privateVar = 10;
    int defaultVar = 20;  // Default (package-private)
    protected int protectedVar = 30;
    public int publicVar = 40;

    void displayValues() {
        System.out.println("Private: " + privateVar);
        System.out.println("Default: " + defaultVar);
        System.out.println("Protected: " + protectedVar);
        System.out.println("Public: " + publicVar);
    }
}

public class AccessModifiers_20 {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        obj.displayValues();

        // System.out.println(obj.privateVar); // ❌ Compilation Error (privateVar is private)
        System.out.println("Default: " + obj.defaultVar);  // ✅ Accessible within the same package
        System.out.println("Protected: " + obj.protectedVar);  // ✅ Accessible within same package
        System.out.println("Public: " + obj.publicVar);  // ✅ Accessible anywhere
    }
}


