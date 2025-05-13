package InnerClass;

//Regular Inner class
class InnerClass_01 {
    private String message = "Hello from Outer";

    class InnerClass {
        void display() {
            System.out.println(message); // Accessing outer class's private field
        }
    }

    public static void main(String[] args) {
        InnerClass_01 outer = new InnerClass_01();
        InnerClass_01.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}

