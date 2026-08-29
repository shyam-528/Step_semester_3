package functions_arrays.class_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ThreeSum
 *
 * Session 5 - LeetCode Practice, Category C, Problem A3: 3Sum.
 *
 * Returns every unique triplet of distinct positions whose values sum to
 * zero, using a sorted array plus the two-pointer technique, with systematic
 * duplicate skipping.
 *
 * Suggested method signature: int[][] threeSum(int[] nums)
 */
public class ThreeSum {

    /** Returns all unique triplets [a, b, c] with a + b + c == 0. */
    public static int[][] threeSum(int[] nums) {
        List<int[]> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return toArray(result);
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // skip duplicate first elements
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(new int[] {nums[i], nums[left], nums[right]});
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++; // skip duplicate second elements
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--; // skip duplicate third elements
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return toArray(result);
    }

    private static int[][] toArray(List<int[]> list) {
        return list.toArray(new int[list.size()][]);
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

    private static String listToString(List<int[]> list) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(arrToString(list.get(i)));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        int[][] cases = {
            {-1, 0, 1, 2, -1, -4},
            {0, 0, 0},
            {-1, 0, 1, 0},
            {1, 2, -2, -1}
        };
        for (int[] n : cases) {
            System.out.println("nums = " + arrToString(n) + "  =>  "
                    + listToString(Arrays.asList(threeSum(n))));
        }
    }
}
