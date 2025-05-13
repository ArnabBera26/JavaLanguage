package StringHandling;

public class StringBuffer_02 {
    public static void main(String[] args) {
        // Creating a StringBuffer instance
        StringBuffer sb = new StringBuffer("Hello");

        // Appending text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Inserting text
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replacing text
        sb.replace(6, 10, "Amazing");
        System.out.println("After replace: " + sb);

        // Deleting characters
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reversing string
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

