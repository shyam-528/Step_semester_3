package strings_arrays.class_problems;

/**
 * SecondLargest
 *
 * Finds the second largest distinct element in an int array.
 * Assumes the array has at least two distinct elements.
 *
 * Example:
 *   input  : [12, 35, 1, 10, 34, 1]
 *   output : 34
 */
public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No distinct second largest element found");
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1};
        System.out.print("Array : [");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i == numbers.length - 1 ? "" : ", "));
        }
        System.out.println("]");
        System.out.println("Second largest: " + findSecondLargest(numbers));
    }
}
