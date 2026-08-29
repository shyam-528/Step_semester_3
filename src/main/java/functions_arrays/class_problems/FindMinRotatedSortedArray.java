package functions_arrays.class_problems;

/**
 * FindMinRotatedSortedArray
 *
 * Session 5 - LeetCode Practice, Category C, Problem A5: Find Minimum in
 * Rotated Sorted Array.
 *
 * Returns the minimum element of a rotated sorted array of distinct values
 * using a modified binary search in O(log n) time.
 *
 * Suggested method signature: int findMin(int[] nums)
 */
public class FindMinRotatedSortedArray {

    /**
     * Modified binary search: compare mid against the rightmost element to
     * decide which half contains the minimum.
     */
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                // The rotation point (minimum) is in the right half.
                left = mid + 1;
            } else {
                // The minimum is mid itself or in the left half.
                right = mid;
            }
        }

        return nums[left];
    }

    private static String arrToString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        int[][] cases = {
            {3, 4, 5, 1, 2},
            {4, 5, 6, 7, 0, 1, 2},
            {11, 13, 15, 17},
            {5},
            {2, 1}
        };
        for (int[] n : cases) {
            System.out.println("nums = " + arrToString(n) + "  =>  " + findMin(n));
        }
    }
}
