import java.util.Arrays;

public class ArrayMethod_04 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); // Output: [1, 2, 5, 8, 9]
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(copiedArray)); // Output: [1, 2, 5]
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println(Arrays.toString(filledArray)); // Output: [7, 7, 7, 7, 7]
        String[] fruits = {"Apple", "Banana", "Cherry"};
        System.out.println(Arrays.asList(fruits)); // Output: [Apple, Banana, Cherry]

    }
}
