# Step_semester_3

Daily progress log for STEP (Semester 3) lab sessions.

Each entry below is added in reverse-chronological order (newest first).

---

## Date: 03-10-2026 (Session 9 - Abstraction Practice, Category C)
**Today's Work:**
- Completed Session 9 Category C abstraction set in `feature/session_9` under `src/main/java/abstraction/class_problems/`:
  1. `GardenPlotReport.java` — abstract `Plot { area() }` + `CirclePlot` (`Math.PI*r*r`), `RectanglePlot`, `TrianglePlot`; report loops over `List<Plot>` (OCP: new shapes need no report change).
  2. `WeeklyStaffPay.java` — abstract `Staff { calculatePay() }` (never instantiated) + `FullTimeStaff`, `HourlyStaff` (40h + 1.5x overtime), `InternStaff`.
  3. `LibraryFineCounter.java` — abstract `LibraryItem { calculateFine() }` + `BookItem` (2/day), `DvdItem` (`min(5/day, 50)`), `MagazineItem` (1/day).
  4. `ElectricityBilling.java` — abstract `Connection { calculateBill() }` + `HomeConnection` (5 first 100, 7 after), `ShopConnection` (8u+100), `FactoryConnection` (`max(6u, 1000)`).
  5. `TravelBooking.java` — abstract `Booking` with single `BOOKING_FEE = 50` + concrete `getTotal()` template; `BusBooking` (2/km), `TrainBooking` (1.5/km), `FlightBooking` (2500+4/km).
- All 5 programs compiled with `javac` and verified against the PDF sample inputs/outputs (2-decimal formatting).
- Added `abstraction/README.md` topic index, `QUIZ.md` (Part B key: C,C,B,C,C,C,D,C,D,B) and `CONCEPTS.md` (Part C: abstraction vs encapsulation, constructors, modifier bans, diamond problem).

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
