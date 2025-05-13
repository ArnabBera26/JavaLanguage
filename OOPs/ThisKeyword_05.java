package OOPs;

// for calling another method
class Person {
    void greet() {
        System.out.println("Hello!");
    }

    void introduce() {
        this.greet(); // Calls the greet method
        System.out.println("I am a Java programmer.");
    }
}

public class ThisKeyword_05 {
    public static void main(String[] args) {
        Person p = new Person();
        p.introduce();
    }
}


