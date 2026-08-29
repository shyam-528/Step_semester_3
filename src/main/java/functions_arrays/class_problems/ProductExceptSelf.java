package functions_arrays.class_problems;

/**
 * ProductExceptSelf
 *
 * Session 5 - LeetCode Practice, Category C, Problem A1: Product of Array
 * Except Self.
 *
 * Returns an array where answer[i] is the product of every element except
 * nums[i], computed in O(n) with a forward (prefix) pass and a backward
 * (suffix) pass, without using division.
 *
 * Suggested method signature: int[] productExceptSelf(int[] nums)
 */
public class ProductExceptSelf {

    /** Computes the product of all elements except each index, no division. */
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass: answer[i] = product of everything to the left of i.
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Backward pass: multiply in the product of everything to the right.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= right;
            right *= nums[i];
        }

        return answer;
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
            {1, 2, 3, 4},
            {-1, 1, 0, -3, 3},
            {2, 3, 4, 5}
        };
        for (int[] n : cases) {
            System.out.println("nums = " + arrToString(n) + "  =>  "
                    + arrToString(productExceptSelf(n)));
        }
    }
}
