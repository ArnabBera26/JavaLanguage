package Collections;


import java.util.TreeMap;
import java.util.Map;

public class TreeMap_06 {
    public static void main(String[] args) {
        // 1. Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // 2. Adding elements
        map.put(1, "Apple");
        map.put(3, "Banana");
        map.put(2, "Cherry");
        map.put(5, "Mango");
        map.put(4, "Orange");

        // 3. Displaying the sorted TreeMap
        System.out.println("TreeMap: " + map);

        // 4. Retrieving values
        System.out.println("Value for key 3: " + map.get(3));

        // 5. Checking if a key or value exists
        System.out.println("Contains key 2? " + map.containsKey(2));
        System.out.println("Contains value 'Mango'? " + map.containsValue("Mango"));

        // 6. Removing elements
        map.remove(5); // Removes entry with key 5

        // 7. Retrieving first and last keys
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // 8. Getting a subset of the map
        System.out.println("SubMap (1 to 3): " + map.subMap(1, 4));

        // 9. Iterating through the TreeMap
        System.out.println("TreeMap Elements:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 10. Checking size of TreeMap
        System.out.println("Size of TreeMap: " + map.size());

        // 11. Checking if TreeMap is empty
        System.out.println("Is TreeMap empty? " + map.isEmpty());

        // 12. Clearing the TreeMap
        map.clear();
        System.out.println("Is TreeMap empty after clearing? " + map.isEmpty());
    }
}

