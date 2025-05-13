package Collections;


import java.util.Deque;
import java.util.LinkedList;

public class Deque_08 {
    public static void main(String[] args) {
        // 1. Creating a Deque
        Deque<String> deque = new LinkedList<>();

        // 2. Adding elements
        deque.addFirst("First"); // Adds at the front
        deque.addLast("Last"); // Adds at the end
        deque.offerFirst("New First"); // Adds at the front (safe version)
        deque.offerLast("New Last"); // Adds at the end (safe version)

        // 3. Retrieving elements
        System.out.println("Peek First: " + deque.peekFirst()); // Retrieves but does not remove first element
        System.out.println("Peek Last: " + deque.peekLast()); // Retrieves but does not remove last element

        // 4. Removing elements
        System.out.println("Poll First: " + deque.pollFirst()); // Retrieves & removes first element
        System.out.println("Poll Last: " + deque.pollLast()); // Retrieves & removes last element
        deque.removeFirst(); // Removes first element
        deque.removeLast(); // Removes last element

        // 5. Checking properties
        System.out.println("Deque size: " + deque.size());
        System.out.println("Is Deque empty? " + deque.isEmpty());

        // 6. Clearing all elements
        deque.clear();
        System.out.println("Is Deque empty after clearing? " + deque.isEmpty());
    }
}

