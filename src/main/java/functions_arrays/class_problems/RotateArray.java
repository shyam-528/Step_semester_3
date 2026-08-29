package functions_arrays.class_problems;

/**
 * RotateArray
 *
 * Session 4 - LeetCode Practice, Category C, Problem L5: Rotate Array.
 *
 * Rotates an int array to the right by k positions using modulo arithmetic to
 * compute each element's new position in a freshly built array.
 *
 * Suggested method signature: int[] rotateArray(int[] nums, int k)
 */
public class RotateArray {

    /** Rotates nums right by k positions and returns the new rotated array. */
    public static int[] rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        k = k % nums.length; // rotating by a multiple of length does nothing
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
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
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2},
            {1, 2, 3},
            {-1, -100, 3, 99}
        };
        int[] ks = {3, 3, 4, 2};

        for (int t = 0; t < numsCases.length; t++) {
            System.out.println("nums = " + arrToString(numsCases[t]) + ", k = " + ks[t]
                    + "  =>  " + arrToString(rotateArray(numsCases[t], ks[t])));
        }
    }
}
