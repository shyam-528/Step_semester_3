# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 27-09-2026 (Session 7 - OOP Basics)
**Today's Work:**
- Completed Session 7 Category C set: implemented all 5 problems in `feature/session_7` under `src/main/java/oops/class_problems/`:
  1. `PlacementRecord.java` — OOP placement record with constructor + `printRecord()` printing `Name -> Company @ LPA`; demoed 3 records in an array loop.
  2. `MessWallet.java` — encapsulated mess wallet with private balance, guarded `topUp(double)` / `deduct(double)` and read-only `getBalance()`; never goes negative.
  3. `Course.java` — theory vs lab courses via `this(...)` constructor chaining; `totalCredits()` returns credits + labCredits.
  4. `IdCard.java` — reference aliasing vs identity demo (`duplicate == ravi: true`, `separate == ravi: false`).
  5. `Student.java` — shared college state via static `collegeName` / `studentCount` and `Student.printCollegeInfo()`.
- All 5 programs compiled with `javac` and verified against the sample inputs/outputs from the assignment.
- Updated the `oops/README.md` topic index to list the Session 7 programs.

**Next Session Plan:**
- Continue with the next Category C problem set.
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
