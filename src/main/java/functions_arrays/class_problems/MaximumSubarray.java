package functions_arrays.class_problems;

/**
 * MaximumSubarray
 *
 * Session 5 - LeetCode Practice, Category C, Problem A2: Maximum Subarray.
 *
 * Finds the contiguous subarray with the largest sum using Kadane's
 * algorithm: at each element, decide whether to extend the running sum or
 * start fresh from the current element.
 *
 * Suggested method signature: int maxSubArray(int[] nums)
 */
public class MaximumSubarray {

    /** Returns the largest sum of any contiguous subarray (Kadane's). */
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int bestSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            bestSum = Math.max(bestSum, currentSum);
        }

        return bestSum;
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
            {-2, 1, -3, 4, -1, 2, 1, -5, 4},
            {-3, -1, -2},
            {1, 2, 3},
            {-1, -2, -3, 0}
        };
        for (int[] n : cases) {
            System.out.println("nums = " + arrToString(n) + "  =>  " + maxSubArray(n));
        }
    }
}
