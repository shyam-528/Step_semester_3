# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

> **Note for graders:** All Java source code lives on the `feature/session_<n>` branches,
> not on `main`. Switch branches via the dropdown above the file list
> (e.g. `feature/session_1`).

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 05-09-2026 (Session 6 - Week 6 Assessment)
**Today's Work:**
- Completed the Session 6 assessment: implemented all 5 problems in `feature/session_6` under `src/main/java/arrays_methods/class_problems/`:
  1. `HackathonScoreBooster.java` — boosts every score in place (no return value), printed with `Arrays.toString(...)`.
  2. `DuplicateTeamNameFinder.java` — finds the first duplicate team name using plain nested loops (no Collections).
  3. `TopThreePodiumFinder.java` — finds the top 3 scores in a single pass, without sorting.
  4. `SeatingGridOptimizer.java` — classifies each (jagged) seating row as Quiet/Buzzing Zone via one reusable `rowAverage(...)` helper.
  5. `PlacementRankingEngine.java` — shortlists candidates via two overloaded `isEligible(...)` checks and ranks them by composite score using `Arrays.sort(...)` + `Comparable<Candidate>`.
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `arrays_methods/README.md` topic index to list the Session 6 programs.

**Next Session Plan:**
- Continue with the next Category C problem set (strings / OOP / recursion topics).
- Pick up take-home assignments from the `assigment_problems/` folder.

**Issues Faced:**
- None
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

## Date: 29-08-2026 (Session 4 - Week 4 Assessment)
**Today's Work:**
- Completed the Session 4 assessment: implemented all 5 problems in `feature/session_4` under `src/main/java/functions_arrays/class_problems/`:
  1. `TwoSum.java` — finds the two indices whose values sum to a target using nested loops.
  2. `BestTimeToBuySellStock.java` — single-pass maximum profit from daily stock prices (0 if prices only fall).
  3. `ContainsDuplicate.java` — returns `true` if any value appears at two different positions.
  4. `MergeSortedArrays.java` — merges two sorted arrays into one sorted result with a two-pointer while loop.
  5. `RotateArray.java` — rotates an array right by `k` positions using modulo (wraparound) indexing.
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `functions_arrays/README.md` topic index to list the Session 4 programs.

**Next Session Plan:**
- Proceed to the advanced Category C problems on a new `feature/session_5` branch created from `develop`.
- Continue the `functions_arrays/` topic with prefix/suffix, Kadane's, 3Sum, and binary search problems.

**Issues Faced:**
- None
---

## Date: 29-08-2026 (Session 3 - Week 3 Assessment)
**Today's Work:**
- Completed the Session 3 assessment: implemented all 5 problems in `feature/session_3` under `src/main/java/arrays_loops/class_problems/`:
  1. `DuplicateSeats.java` — Exam Hall Seat Duplication Checker: nested-loop duplicate scan (no Collections).
  2. `TypingAccuracy.java` — Typing Speed Test Accuracy Checker: char-by-char comparison, accuracy %, first mismatch position.
  3. `TrafficSignalStreak.java` — Traffic Signal Streak Analyzer: longest run of identical consecutive signal chars.
  4. `InventoryBalancer.java` — Warehouse Inventory Balancer: section totals (Balanced / Not Balanced) + single highest quantity with location.
  5. `WordLengthProfiler.java` — Movie Review Word Length Profiler: Short (1-4) / Medium (5-8) / Long (9+) word counts.
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `arrays_loops/README.md` topic index to list the Session 3 programs.

**Next Session Plan:**
- Begin LeetCode Practice (Category C) on a new `feature/session_4` branch created from `develop`.
- Continue with functions & arrays problems (Two Sum, stock profit, merge, rotate).

**Issues Faced:**
- None
---

## Date: 29-08-2026 (Session 2 - Week 2 Assessment)
**Today's Work:**
- Completed the Week 2 assessment: implemented all 5 problems in `feature/session_2` under `src/main/java/arrays_loops/class_problems/`:
  1. `DuplicateSeats.java` — Exam Hall Seat Duplication Checker (nested loops, no Collections).
  2. `TypingAccuracy.java` — Typing Speed Test Accuracy Checker (char-by-char, accuracy %, first mismatch).
  3. `TrafficSignalStreak.java` — Traffic Signal Streak Analyzer (longest run of identical chars).
  4. `InventoryBalancer.java` — Warehouse Inventory Balancer (Balanced / Not Balanced + highest quantity).
  5. `WordLengthProfiler.java` — Movie Review Word Length Profiler (Short / Medium / Long counts).
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `arrays_loops/README.md` topic index to list the Week 2 programs.

**Next Session Plan:**
- Continue the Arrays, Loops & String Traversal topic with the Session 3 problem set on a new `feature/session_3` branch from `develop`.

**Issues Faced:**
- None
---

## Date: 29-08-2026 (Week 1 Assessment)
**Today's Work:**
- Completed the Week 1 assessment: implemented all 5 problems in `feature/session_1` under `src/main/java/strings_arrays/class_problems/`:
  1. `RockPaperScissors.java` — 5-round RPS simulator with per-round results and final scoreboard (Wins / Losses / Draws / Win %).
  2. `PalindromeChecker.java` — three independent palindrome checks (iterative, recursive, array-reversal) that always agree.
  3. `BmiCalculator.java` — BMI for a 10-person team with Underweight / Normal / Overweight / Obese classification and a clean report table.
  4. `FirstNonRepeatingChar.java` — returns the first character with frequency 1, or reports none.
  5. `ReverseCustomerName.java` — returns a reversed copy of a customer's name without mutating the original.
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `strings_arrays/README.md` topic index to list the Week 1 programs.

**Next Session Plan:**
- Begin Week 2 / Session 2 work on a new `feature/session_2` branch created from `develop`.
- Pick the next topic folder (e.g. `recursion/` or `oop/`) and add the new class problems there.

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
