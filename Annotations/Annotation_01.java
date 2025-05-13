package Annotations;
// Basic built in annotation 
class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void show() { // Ensures method correctly overrides superclass method
        System.out.println("Child class method");
    }
}

public class Annotation_01 {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show(); // Calls overridden method
    }
}

