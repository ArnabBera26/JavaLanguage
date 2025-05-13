package Collections;


import java.util.HashSet;

public class HashSet_03 {
    public static void main(String[] args) {
        // 1. Creating a HashSet
        HashSet<String> fruits = new HashSet<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango"); 

        // 3. Removing elements
        fruits.remove("Cherry"); // Removes specific element

        // 4. Checking if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 5. Checking size
        System.out.println("Size of HashSet: " + fruits.size());

        // 6. Checking if HashSet is empty
        System.out.println("Is HashSet empty? " + fruits.isEmpty());

        // 7. Iterating through HashSet
        System.out.println("Fruits in HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Clearing all elements
        fruits.clear();
        System.out.println("Is HashSet empty after clearing? " + fruits.isEmpty());
    }
}

