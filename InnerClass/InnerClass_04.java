package InnerClass;

abstract class Greeting {
    abstract void sayHello();
}

public class InnerClass_04 {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() { // Anonymous Inner Class
            void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };
        greeting.sayHello();
    }
}

