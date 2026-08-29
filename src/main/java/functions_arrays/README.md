# functions_arrays

Topic: **LeetCode Practice — Functions & Arrays, Category C (Advanced)** — STEP Semester 3, Session 5.

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session.
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*

## Session 5 - class problems (Category C, Advanced)

| # | File | What it does | Method |
|---|------|--------------|--------|
| A1 | `ProductExceptSelf.java`            | Product of all elements except each index, in O(n), using a forward (prefix) and backward (suffix) pass, **no division** (handles zeros). | `int[] productExceptSelf(int[] nums)` |
| A2 | `MaximumSubarray.java`              | Largest sum of any contiguous subarray using Kadane's algorithm (handles all-negative arrays). | `int maxSubArray(int[] nums)` |
| A3 | `ThreeSum.java`                     | All unique triplets that sum to zero, via sort + two pointers with duplicate skipping. | `int[][] threeSum(int[] nums)` |
| A4 | `SubarraySumEqualsK.java`           | Count of contiguous subarrays summing to k, via prefix sums + a hash map of prefix frequencies (works with negatives). | `int subarraySum(int[] nums, int k)` |
| A5 | `FindMinRotatedSortedArray.java`    | Minimum of a rotated sorted array via modified binary search in O(log n). | `int findMin(int[] nums)` |

## Sample Input / Output (verified)

| Problem | Input | Output |
|---------|-------|--------|
| ProductExceptSelf | `nums = [1, 2, 3, 4]` | `[24, 12, 8, 6]` |
| ProductExceptSelf | `nums = [-1, 1, 0, -3, 3]` | `[0, 0, 9, 0, 0]` |
| MaximumSubarray | `nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]` | `6` |
| MaximumSubarray | `nums = [-3, -1, -2]` | `-1` |
| ThreeSum | `nums = [-1, 0, 1, 2, -1, -4]` | `[[-1, -1, 2], [-1, 0, 1]]` |
| ThreeSum | `nums = [0, 0, 0]` | `[[0, 0, 0]]` |
| SubarraySum | `nums = [1, 1, 1], k = 2` | `2` |
| SubarraySum | `nums = [1, -1, 0], k = 0` | `3` |
| FindMin | `nums = [3, 4, 5, 1, 2]` | `1` |
| FindMin | `nums = [4, 5, 6, 7, 0, 1, 2]` | `0` |
| FindMin | `nums = [11, 13, 15, 17]` | `11` |

## Concepts covered

- Prefix and suffix products, two-pass traversal, zero handling without division (Product Except Self).
- Kadane's algorithm - "extend vs. restart" decision; divide-and-conquer alternative (Maximum Subarray).
- Sorting as setup, two-pointer technique, systematic duplicate avoidance (3Sum).
- Prefix sums + hash map frequency counting; why sliding window fails with negatives (Subarray Sum).
- Modified binary search on a rotated array, including the no-rotation case (Find Minimum).
