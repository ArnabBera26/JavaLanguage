package InnerClass;

//Static Nested class 
class OuterClass2 {
    static class StaticNested { // Static Nested Class
        void display() {
            System.out.println("Hello from Static Nested Class!");
        }
    }
}

public class InnerClass_02 {
    public static void main(String[] args) {
        OuterClass2.StaticNested staticNested = new OuterClass2.StaticNested(); // Direct instantiation
        staticNested.display();
    }
}


