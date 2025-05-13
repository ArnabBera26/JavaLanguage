package Collections;


import java.util.LinkedList;
import java.util.Collections;

public class LinkedList_02 {
    public static void main(String[] args) {
        // 1. Creating a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 2. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Mango"); // Adding at a specific index
        fruits.addFirst("Orange"); // Adds at the beginning
        fruits.addLast("Grapes"); // Adds at the end

        // 3. Removing elements
        fruits.remove("Cherry"); // Removes first occurrence
        fruits.remove(2); // Removes element at index 2
        fruits.removeFirst(); // Removes the first element
        fruits.removeLast(); // Removes the last element

        // 4. Retrieving elements
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());
        System.out.println("Element at index 1: " + fruits.get(1));

        // 5. Updating elements
        fruits.set(1, "Orange");

        // 6. Checking list properties
        System.out.println("Size of list: " + fruits.size());
        System.out.println("Is list empty? " + fruits.isEmpty());
        System.out.println("Contains Banana? " + fruits.contains("Banana"));

        // 7. Sorting the list
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        // 8. Using Queue-specific methods
        fruits.offer("Peach"); // Adds like add()
        System.out.println("Peek first element: " + fruits.peek()); // Retrieves but does not remove
        System.out.println("Poll first element: " + fruits.poll()); // Retrieves and removes first element

        // 9. Clearing the list
        fruits.clear();
        System.out.println("Is list empty after clearing? " + fruits.isEmpty());
    }
}

