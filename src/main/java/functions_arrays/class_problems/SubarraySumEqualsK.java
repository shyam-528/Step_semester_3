package functions_arrays.class_problems;

import java.util.HashMap;
import java.util.Map;

/**
 * SubarraySumEqualsK
 *
 * Session 5 - LeetCode Practice, Category C, Problem A4: Subarray Sum Equals
 * K.
 *
 * Counts the number of contiguous subarrays whose sum equals exactly k, using
 * prefix sums and a hash map of prefix-sum frequencies. Works correctly even
 * with negative numbers (unlike a sliding window).
 *
 * Suggested method signature: int subarraySum(int[] nums, int k)
 */
public class SubarraySumEqualsK {

    /** Counts contiguous subarrays summing to k using prefix-sum frequencies. */
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        // Map prefix sum -> how many times it has occurred.
        Map<Integer, Integer> prefixCounts = new HashMap<>();
        prefixCounts.put(0, 1); // the "empty prefix" base case

        for (int num : nums) {
            currentSum += num;

            // If (currentSum - k) occurred earlier, the stretch between them
            // sums to k.
            count += prefixCounts.getOrDefault(currentSum - k, 0);

            prefixCounts.put(currentSum, prefixCounts.getOrDefault(currentSum, 0) + 1);
        }

        return count;
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
        int[][] numsCases = {
            {1, 1, 1},
            {1, -1, 0},
            {1, 2, 3},
            {1, 2, 1, 2, 1}
        };
        int[] ks = {2, 0, 3, 3};

        for (int t = 0; t < numsCases.length; t++) {
            System.out.println("nums = " + arrToString(numsCases[t]) + ", k = " + ks[t]
                    + "  =>  " + subarraySum(numsCases[t], ks[t]));
        }
    }
}
