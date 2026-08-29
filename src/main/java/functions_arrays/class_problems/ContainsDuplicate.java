package functions_arrays.class_problems;

/**
 * ContainsDuplicate
 *
 * Session 4 - LeetCode Practice, Category C, Problem L3: Contains Duplicate.
 *
 * Given an int array, checks every pair of entries (i, j) with i != j and
 * returns true as soon as two different positions hold the same value.
 *
 * Suggested method signature: boolean containsDuplicate(int[] nums)
 */
public class ContainsDuplicate {

    /** Returns true if any value appears at two different positions. */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
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
            {1, 2, 3, 1},
            {1, 2, 3, 4},
            {7, 8, 7},
            {}
        };
        for (int[] n : cases) {
            System.out.println("nums = " + arrToString(n) + "  =>  " + containsDuplicate(n));
        }
    }
}
