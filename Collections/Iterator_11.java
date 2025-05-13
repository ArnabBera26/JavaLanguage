package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterator_11 {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Using Iterator to iterate over Entry Set
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

            // Example: Removing an entry while iterating
            if (entry.getKey() == 2) {
                iterator.remove();
            }
        }

        System.out.println("Updated HashMap: " + map);
    }
}

