package functions_arrays.class_problems;

/**
 * TwoSum
 *
 * Session 4 - LeetCode Practice, Category C, Problem L1: Two Sum.
 *
 * Given an int array and a target, finds the two different indices whose
 * values sum to the target using two nested loops. Assumes exactly one valid
 * pair exists and a single element cannot be used twice.
 *
 * Suggested method signature: int[] twoSum(int[] nums, int target)
 */
public class TwoSum {

    /**
     * Scans every pair (i, j) with i != j and returns the first pair whose
     * values add up to the target. Returns {-1, -1} if no such pair exists.
     */
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return new int[] {-1, -1};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1, -1};
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
            {2, 7, 11, 15},
            {3, 2, 4},
            {3, 3}
        };
        int[] targets = {9, 6, 6};

        for (int t = 0; t < numsCases.length; t++) {
            int[] idx = twoSum(numsCases[t], targets[t]);
            System.out.print("nums = " + arrToString(numsCases[t]) + ", target = " + targets[t]
                    + "  =>  " + arrToString(idx));
            if (idx[0] != -1) {
                System.out.println("  (nums[" + idx[0] + "] + nums[" + idx[1] + "] = "
                        + numsCases[t][idx[0]] + " + " + numsCases[t][idx[1]] + " = " + targets[t] + ")");
            } else {
                System.out.println();
            }
        }
    }
}
