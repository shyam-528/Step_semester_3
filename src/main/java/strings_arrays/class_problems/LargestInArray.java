package strings_arrays.class_problems;

/**
 * LargestInArray
 *
 * Finds the largest element in an int array.
 *
 * Example:
 *   input  : [3, 7, 1, 9, 4]
 *   output : 9
 */
public class LargestInArray {

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 1, 9, 4, 12, -5, 6};
        System.out.print("Array : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("Largest element: " + findLargest(numbers));
    }
}
