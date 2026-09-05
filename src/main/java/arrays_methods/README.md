# arrays_methods

Topic: **Java Arrays & Methods — Category C Practice** — STEP Semester 3, Session 6.

## Folder layout (per STEP spec)

- `class_problems/`     - problems solved live in the lab session.
- `assigment_problems/` - take-home assignments. *(Spelling preserved per the STEP GitHub guide.)*

## Session 6 - class problems (Category C)

| # | File | What it does | Method |
|---|------|--------------|--------|
| 1 | `HackathonScoreBooster.java`   | Adds a flat bonus to every score **in place** (no return), prints via `Arrays.toString`. | `static void curveScores(int[] scores, int bonus)` |
| 2 | `DuplicateTeamNameFinder.java` | Finds the first duplicate team name using plain nested loops (no Collections). | `static String findDuplicateTeam(String[] teamNames)` |
| 3 | `TopThreePodiumFinder.java`    | Finds the top 3 scores in a single pass — no sorting. | `static int[] findTopThreeScores(int[] scores)` |
| 4 | `SeatingGridOptimizer.java`    | Classifies each (jagged) grid row Quiet/Buzzing via one reusable `rowAverage` helper. | `static double rowAverage(int[] row)` / `static String classifyRows(int[][] grid, int threshold)` |
| 5 | `PlacementRankingEngine.java`  | Shortlists via overloaded `isEligible` checks and ranks by composite score with `Arrays.sort` + `Comparable`. | `static boolean isEligible(double cgpa)` / `static boolean isEligible(double cgpa, int codingScore)` / `static String shortlistAndRank(Candidate[] c)` |

## Sample Input / Output (verified)

| Problem | Input | Output |
|---------|-------|--------|
| Curve Booster | `scores = {70, 85, 60}, bonus = 10` | `[80, 95, 70]` |
| Duplicate Finder | `{"ByteForce", "CodeCrafters", "ByteForce"}` | `Duplicate Found: ByteForce` |
| Duplicate Finder | `{"ByteForce", "CodeCrafters", "NullPointers"}` | `No Duplicates Found` |
| Top-3 Podium | `{45, 82, 79, 90, 33, 90, 61}` | `[90, 90, 82]` |
| Seating Grid | 3-row grid, `threshold = 60` | `Row 0: Quiet Zone \| Row 1: Buzzing Zone \| Row 2: Quiet Zone` |
| Placement Engine | Aisha(8.2, 40), Rohit(6.8, 65), Meena(6.0, 90), Karan(7.5, 20) | `1. Aisha (102.0) \| 2. Rohit (100.5) \| 3. Karan (85.0)` |

## Concepts covered

- Pass-by-value of references: in-place array mutation without returning (`curveScores`).
- Nested-loop pairwise scanning with early exit (`findDuplicateTeam`).
- Single-pass running maximum×3 with correct shift-down ordering (`findTopThreeScores`).
- Helper-method decomposition; jagged 2-D arrays; threshold classification (`rowAverage` + `classifyRows`).
- Method overloading, `static` methods, constructors & encapsapsulation, `Comparable<Candidate>`, and standard-library sorting via `Arrays.sort(...)` (Placement Engine).
