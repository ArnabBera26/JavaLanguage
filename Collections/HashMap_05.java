package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_05 {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding elements
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        // 3. Retrieving values
        System.out.println("Value for key 2: " + map.get(2));

        // 4. Checking if a key or value exists
        System.out.println("Contains key 3? " + map.containsKey(3));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 5. Removing elements
        map.remove(3); // Removes entry with key 3

        // 6. Iterating through the HashMap
        System.out.println("HashMap elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 7. Checking size of HashMap
        System.out.println("Size of HashMap: " + map.size());

        // 8. Checking if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 9. Clearing the HashMap
        map.clear();
        System.out.println("Is HashMap empty after clearing? " + map.isEmpty());
    }
}
