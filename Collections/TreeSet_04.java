package Collections;


import java.util.TreeSet;

public class TreeSet_04 {
    public static void main(String[] args) {
        // 1. Creating a TreeSet
        TreeSet<String> fruits = new TreeSet<>();

        // 2. Adding elements (Sorted automatically)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // 3. Removing elements
        fruits.remove("Cherry"); // Removes specific element

        // 4. Checking if an element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 5. Checking size
        System.out.println("Size of TreeSet: " + fruits.size());

        // 6. Checking if TreeSet is empty
        System.out.println("Is TreeSet empty? " + fruits.isEmpty());

        // 7. Iterating through TreeSet
        System.out.println("Fruits in TreeSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. Retrieving first and last elements
        System.out.println("First element: " + fruits.first());
        System.out.println("Last element: " + fruits.last());

        // 9. Using subset methods
        System.out.println("Subset: " + fruits.subSet("Apple", "Mango"));

        // 10. Removing all elements
        fruits.clear();
        System.out.println("Is TreeSet empty after clearing? " + fruits.isEmpty());
    }
}


