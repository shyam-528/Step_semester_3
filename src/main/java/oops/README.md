# oops

Topic: **OOP Basics — Category C Practice** — STEP Semester 3, Session 7.

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session.
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*

## Session 7 - class problems (Category C)

| # | File | What it does | Method |
|---|------|--------------|--------|
| M1 | `PlacementRecord.java` | OOP replacement for parallel placement arrays; prints `Name -> Company @ LPA`. | `void printRecord()` |
| M2 | `MessWallet.java` | Encapsulated mess-card wallet; private balance, guarded top-up/deduct. | `void topUp(double)` / `void deduct(double)` / `double getBalance()` |
| M3 | `Course.java` | Theory vs theory+lab courses via constructor chaining with `this(...)`. | `public Course(...)` / `int totalCredits()` |
| M4 | `IdCard.java` | Reference aliasing vs identity demo with `==`. | `class IdCard { String name; int booksIssued; }` |
| M5 | `Student.java` | Shared college state via `static` fields and static printer. | `static void printCollegeInfo()` |

## Sample Input / Output (verified)

| Problem | Input | Output |
|---------|-------|--------|
| M1 Placement | Ravi/TCS/4.5, Anitha/Zoho/6.2, Karthik/Infosys/4.0 | `Ravi -> TCS @ 4.5 LPA` etc. |
| M2 Wallet | opening=500, topUp(200), deduct(1000) | `Balance after top-up: 700.0` / `Deduct rejected: insufficient balance` / `Final balance: 700.0` |
| M3 Course | 21CSC201J/Data Structures/4; 21CSC205L/DSA Lab/3+1 | `21CSC201J total credits: 4` / `21CSC205L total credits: 4` |
| M4 IdCard | ravi(0), duplicate=ravi→3, separate(Ravi,3) | `booksIssued: 3` / `duplicate == ravi: true` / `separate == ravi: false` |
| M5 Student | 2 Student objects | `SRM Institute of Science and Technology` / `Students created: 2` |

## Concepts covered

- Classes, objects, constructors, instance methods, arrays of objects (M1).
- Encapsulation (`private`), validation, read-only getters, no setters (M2).
- Constructor overloading + `this(...)` chaining (M3).
- Reference semantics, aliasing, `==` identity vs value equality (M4).
- `static` fields/methods, shared state, calling statics via class name (M5).
