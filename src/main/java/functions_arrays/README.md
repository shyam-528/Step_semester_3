# functions_arrays

Topic: **LeetCode Practice — Functions & Arrays, Category C** — STEP Semester 3, Session 4.

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session.
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*

## Session 4 - class problems (Category C)

| # | File | What it does | Method |
|---|------|--------------|--------|
| L1 | `TwoSum.java`                  | Finds the two indices whose values sum to a target using nested loops. | `int[] twoSum(int[] nums, int target)` |
| L2 | `BestTimeToBuySellStock.java`  | Single-pass max profit from daily stock prices (0 if prices only fall). | `int maxProfit(int[] prices)` |
| L3 | `ContainsDuplicate.java`       | Returns `true` if any value appears at two different positions. | `boolean containsDuplicate(int[] nums)` |
| L4 | `MergeSortedArrays.java`       | Merges two sorted arrays into one sorted result (two-pointer while loop). | `int[] mergeSortedArrays(int[] arr1, int[] arr2)` |
| L5 | `RotateArray.java`             | Rotates an array right by `k` using modulo (wraparound) indexing. | `int[] rotateArray(int[] nums, int k)` |

## Sample Input / Output (verified)

| Problem | Input | Output |
|---------|-------|--------|
| TwoSum | `nums = [2, 7, 11, 15], target = 9` | `[0, 1]` |
| TwoSum | `nums = [3, 2, 4], target = 6` | `[1, 2]` |
| Stock | `prices = [7, 1, 5, 3, 6, 4]` | `5` |
| Stock | `prices = [7, 6, 4, 3, 1]` | `0` |
| ContainsDuplicate | `nums = [1, 2, 3, 1]` | `true` |
| ContainsDuplicate | `nums = [1, 2, 3, 4]` | `false` |
| Merge | `arr1 = [1, 3, 5], arr2 = [2, 4, 6]` | `[1, 2, 3, 4, 5, 6]` |
| Merge | `arr1 = [], arr2 = [1, 2, 3]` | `[1, 2, 3]` |
| Rotate | `nums = [1, 2, 3, 4, 5, 6, 7], k = 3` | `[5, 6, 7, 1, 2, 3, 4]` |
| Rotate | `nums = [1, 2], k = 3` | `[2, 1]` |

## Concepts covered

- Nested loops and pairwise search (Two Sum, Contains Duplicate).
- Single-pass traversal with running minimum/maximum (Stock).
- Modulo arithmetic for wraparound indexing (Rotate Array).
- Two-pointer / while-loop merge (Merge Sorted Arrays).
