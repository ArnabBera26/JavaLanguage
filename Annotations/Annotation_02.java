package Annotations;
//custom annotation 

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME) // Makes annotation available at runtime
@Target(ElementType.METHOD) // Can be used only on methods
@interface MyAnnotation {
    String value(); // Annotation has a string parameter
}

class Example {
    @MyAnnotation(value = "Custom annotation applied") // Using the annotation
    void display() {
        System.out.println("Method executed!");
    }
}

public class Annotation_02 {
    public static void main(String[] args) throws Exception {
        Example obj = new Example();
        obj.display();
        
        // Reading annotation value
        MyAnnotation annotation = obj.getClass().getMethod("display").getAnnotation(MyAnnotation.class);
        System.out.println("Annotation Value: " + annotation.value());
    }
}

