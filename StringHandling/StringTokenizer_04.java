package StringHandling;

import java.util.StringTokenizer;

public class StringTokenizer_04 {
    public static void main(String[] args) {
        // Create a StringTokenizer with space as the default delimiter
        StringTokenizer st = new StringTokenizer("Java is amazing");

        // Print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Using custom delimiters
        StringTokenizer st2 = new StringTokenizer("Apple,Orange,Banana", ",");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}

