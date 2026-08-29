# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 29-08-2026 (Session 5 - Week 5 Assessment)
**Today's Work:**
- Completed the Session 5 assessment: implemented all 5 problems in `feature/session_5` under `src/main/java/functions_arrays/class_problems/`:
  1. `ProductExceptSelf.java` — product of all elements except each index in O(n) via a forward (prefix) and backward (suffix) pass, with no division (handles zeros).
  2. `MaximumSubarray.java` — largest contiguous subarray sum using Kadane's algorithm (handles all-negative arrays).
  3. `ThreeSum.java` — all unique triplets summing to zero via sort + two pointers with duplicate skipping.
  4. `SubarraySumEqualsK.java` — counts subarrays summing to k using prefix sums + a hash map of prefix frequencies (works with negatives).
  5. `FindMinRotatedSortedArray.java` — minimum of a rotated sorted array via modified binary search in O(log n).
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `functions_arrays/README.md` topic index to list the Session 5 programs.

**Next Session Plan:**
- Continue with further LeetCode Category topics (strings, two-pointers, DP).
- Pick up take-home assignments from the `assigment_problems/` folder.

**Issues Faced:**
- None

---

## Date: 29-08-2026
**Today's Work:**
- Initialized the `Step_semester_3` repository on GitHub.
- Created the three required branches: `main`, `develop`, and `feature/session_1`.
- Added an empty Java project skeleton (IDE-style: `src/main/java/`) on the `develop` branch.
- Created the `feature/session_1` branch from `develop` with the topic folder `src/main/java/strings_arrays/` and the two sub-packages `class_problems/` and `assigment_problems/` (spelling per STEP spec).
- Wrote initial Strings / Arrays class-problem solutions (ReverseString, PalindromeCheck, LargestInArray, SecondLargest) under `class_problems/`.

**Next Session Plan:**
- Add more Strings / Arrays class problems (anagram check, frequency count, rotate array, etc.).
- Pick up the first take-home assignment from the `assigment_problems/` folder and push the solution on a new `feature/session_2` branch.

**Issues Faced:**
- None
---
