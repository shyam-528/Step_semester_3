# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 29-08-2026 (Session 6 - Week 6 Assessment)
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
