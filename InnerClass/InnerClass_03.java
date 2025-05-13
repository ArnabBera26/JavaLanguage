package InnerClass;

// Method local inner class
class OuterClass {
    void outerMethod() {
        class MethodLocalInner { // Local Inner Class inside method
            void display() {
                System.out.println("Hello from Method-Local Inner Class!");
            }
        }
        MethodLocalInner inner = new MethodLocalInner(); // Instantiating inside the method
        inner.display();
    }
}

public class InnerClass_03 {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.outerMethod(); // Calling the method that contains Method-Local Inner Class
    }
}

