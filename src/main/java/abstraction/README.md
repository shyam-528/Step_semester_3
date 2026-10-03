# abstraction

Topic: **Abstraction in Java (Category C Practice)** — STEP Semester 3, Session 9.

All 5 coding problems use one idea: a common **abstract base type** that holds
shared state and declares one abstract method. Each concrete kind overrides
that method with its own formula. Client/reporting code only talks to the
abstract type, so new kinds can be added without touching the report loop
(Open/Closed Principle).

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session (5 programs below).
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*
- `QUIZ.md`             - Part B answers (10 MCQs with reasons).
- `CONCEPTS.md`         - Part C answers (5 concept questions).

## Session 9 - class problems (Category C)

| # | File | What it does | Key abstraction |
|---|------|--------------|-----------------|
| P1 | `GardenPlotReport.java` | Garden plot areas + total. `CIRCLE owner r`, `RECTANGLE owner l w`, `TRIANGLE owner b h`. | `abstract class Plot { abstract double area(); }` → `CirclePlot` (`Math.PI*r*r`), `RectanglePlot` (`l*w`), `TrianglePlot` (`0.5*b*h`). Report loops over `List<Plot>`. |
| P2 | `WeeklyStaffPay.java` | Weekly pay + total payroll. `FULLTIME / HOURLY / INTERN`. | `abstract class Staff { abstract double calculatePay(); }` — can never `new Staff()`. `HourlyStaff` does `40*rate + overtime*1.5*rate`. |
| P3 | `LibraryFineCounter.java` | Late fines + total. `BOOK / DVD / MAGAZINE`. | `abstract class LibraryItem { abstract double calculateFine(); }` → `BookItem` (`2/day`), `DvdItem` (`min(5/day, 50)`), `MagazineItem` (`1/day`). |
| P4 | `ElectricityBilling.java` | Connection bills + total. `HOME / SHOP / FACTORY`. | `abstract class Connection { abstract double calculateBill(); }` → Home slabs (`5` first 100, `7` after), Shop (`8*u+100`), Factory (`max(6*u, 1000)`). |
| P5 | `TravelBooking.java` | Booking totals (no grand total per spec). `BUS / TRAIN / FLIGHT`. | `abstract class Booking` with **single** `BOOKING_FEE = 50` + concrete `getTotal() = calculateFare() + BOOKING_FEE`; subclasses implement only `calculateFare()`. Fee change = 1 line. |

## Sample Input / Output (all verified with `javac` + `java`)

| Problem | Sample Input | Sample Output |
|---------|--------------|---------------|
| P1 Garden | `3 / CIRCLE Asha 5 / RECTANGLE Ravi 4 6 / TRIANGLE Neha 10 3` | `Asha (CIRCLE): 78.54 / Ravi (RECTANGLE): 24.00 / Neha (TRIANGLE): 15.00 / Total Area: 117.54` |
| P2 Staff | `3 / FULLTIME Asha 12000 / HOURLY Ravi 45 200 / INTERN Neha 5000` | `Asha: 12000.00 / Ravi: 9500.00 / Neha: 5000.00 / Total Payroll: 26500.00` |
| P3 Library | `3 / BOOK Algebra 4 / DVD Inception 12 / MAGAZINE Sports 3` | `Algebra: 8.00 / Inception: 50.00 / Sports: 3.00 / Total Fines: 61.00` |
| P4 Electricity | `3 / HOME 150 / SHOP 90 / FACTORY 120` | `HOME: 850.00 / SHOP: 820.00 / FACTORY: 1000.00 / Total: 2670.00` |
| P5 Travel | `3 / BUS 200 / TRAIN 300 / FLIGHT 500` | `BUS: 450.00 / TRAIN: 500.00 / FLIGHT: 4550.00` |

All money/area values printed with `%.2f`.

## How to compile and run

```bash
# from repo root
javac -d out src/main/java/abstraction/class_problems/*.java

echo "3
CIRCLE Asha 5
RECTANGLE Ravi 4 6
TRIANGLE Neha 10 3" | java -cp out abstraction.class_problems.GardenPlotReport

echo "3
FULLTIME Asha 12000
HOURLY Ravi 45 200
INTERN Neha 5000" | java -cp out abstraction.class_problems.WeeklyStaffPay

echo "3
BOOK Algebra 4
DVD Inception 12
MAGAZINE Sports 3" | java -cp out abstraction.class_problems.LibraryFineCounter

echo "3
HOME 150
SHOP 90
FACTORY 120" | java -cp out abstraction.class_problems.ElectricityBilling

echo "3
BUS 200
TRAIN 300
FLIGHT 500" | java -cp out abstraction.class_problems.TravelBooking
```

Each file is self-contained (abstract base + subclasses + `main` in one file)
so it can also be run directly in an IDE or with `java <File>.java` on JDK 11+.

## Concepts covered

- Abstract class as a common base type: shared fields/constructor + one abstract method every subclass must implement (P1–P5).
- `abstract` prevents direct instantiation (`new Staff()` / `new Plot()` is a compile error) (P2).
- Polymorphic reporting: `for (Plot p : plots) p.area()` — no `instanceof`, OCP-compliant (P1).
- Template-method pattern: abstract class supplies concrete `getTotal()` around abstract `calculateFare()`; shared constant in one place (P5).
- Business-rule encoding: overtime `1.5x`, DVD cap `Math.min(..., 50)`, home slabs, shop fixed charge, factory minimum via `Math.max` (P2–P4).
