public class StringMethod_03 {

    public static void main(String[] args) {
        String str = "Java Programming";
        System.out.println(str.length()); // Output: 16
        System.out.println(str.toUpperCase()); // Output: JAVA PROGRAMMING
        System.out.println(str.toLowerCase()); // Output: java programming
        System.out.println(str.charAt(5)); // Output: P
        System.out.println(str.substring(5, 16)); // Output: Programming
        System.out.println(str.contains("Pro")); // Output: true
        System.out.println(str.replace('a', 'X')); // Output: JXvX ProgrXmming
        String spaced = "  Hello World!  ";
        System.out.println(spaced.trim()); // Output: Hello World!
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        String s1 = "Hello";
        String s2 = "hello";
        System.out.println(s1.equals(s2)); // Output: false
        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true
        System.out.println(s1.equals(s2)); // Output: false
        System.out.println(s1.equalsIgnoreCase(s2)); // Output: true
    }
}