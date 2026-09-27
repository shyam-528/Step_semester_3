# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 27-09-2026 (Session 8 - Abstraction, Interface, Class vs Interface)
**Today's Work:**
- Completed Session 8 Category C concept set in `feature/session_8` under `src/main/java/abstraction/class_problems/`:
  1. `Device.java` — abstract base with shared state/code + abstract `performPrimaryAction()`; never instantiated directly.
  2. `Remoteable.java` / `Schedulable.java` / `EnergyMonitorable.java` — pure capability contracts adoptable by any class.
  3. `SmartLight.java` — IS-A Device + CAN-DO Remoteable, Schedulable.
  4. `SmartThermostat.java` — extends ONE class, implements THREE interfaces (multiple inheritance of capability).
  5. `BasicLamp.java` — IS-A Device with no interfaces: full identity, zero extra capabilities.
  6. `SmartDoorLock.java` — Remoteable without being a Device; works in `Remoteable[]`.
  7. `HomeHubLogger.java` — plain class for the no-variation case.
  8. `SmartHomeDemo.java` — wrap-up program reproducing the PDF p9 output, including `connectAllToApp(Remoteable[], appId)`.
- All programs compiled with `javac` and verified against the sample outputs from the document.
- Updated the `abstraction/README.md` topic index to list the Session 8 programs.

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
