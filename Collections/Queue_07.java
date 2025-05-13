package Collections;

import java.util.Queue;
import java.util.LinkedList;

public class Queue_07 {
    public static void main(String[] args) {
        // 1. Creating a Queue
        Queue<String> queue = new LinkedList<>();

        // 2. Adding elements
        queue.add("Task 1"); // Throws exception if capacity is full
        queue.offer("Task 2"); // Returns false if capacity is full
        queue.offer("Task 3");

        // 3. Retrieving elements
        System.out.println("Peek: " + queue.peek()); // Retrieves but does not remove the first element
        System.out.println("Poll: " + queue.poll()); // Retrieves and removes the first element
        System.out.println("Element: " + queue.element()); // Retrieves first element (throws exception if empty)

        // 4. Checking queue properties
        System.out.println("Queue size: " + queue.size());
        System.out.println("Is Queue empty? " + queue.isEmpty());

        // 5. Removing elements
        queue.remove("Task 2"); // Removes specific element
        queue.clear(); // Removes all elements

        System.out.println("Is Queue empty after clearing? " + queue.isEmpty());
    }
}

