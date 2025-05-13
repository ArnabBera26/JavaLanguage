package Collections;


import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_01 {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Mango"); // Adding at specific index

        // 3. Removing elements
        fruits.remove("Cherry");
        fruits.remove(2); // Removes element at index 2

        // 4. Retrieving elements
        System.out.println("First fruit: " + fruits.get(0));

        // 5. Updating elements
        fruits.set(1, "Orange");

        // 6. Checking size
        System.out.println("Size of list: " + fruits.size());

        // 7. Checking if list contains an element
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // 8. Iterating through list using a loop
        System.out.println("List elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 9. Sorting the list
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 10. Clearing the list
        fruits.clear();
        System.out.println("Is list empty? " + fruits.isEmpty());

        // 11. checking is empty or not
        System.out.println(fruits.isEmpty());
    }
}

