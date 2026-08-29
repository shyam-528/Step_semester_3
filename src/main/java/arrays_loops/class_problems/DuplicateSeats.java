package arrays_loops.class_problems;

/**
 * DuplicateSeats
 *
 * Week 2 Assessment - Problem 1: The Exam Hall Seat Duplication Checker.
 *
 * Scans an int array of seat numbers and reports any duplicate value using
 * only arrays and nested loops (no Collections).
 *
 * Suggested method signature: void checkDuplicateSeats(int[] seatNumbers)
 */
public class DuplicateSeats {

    /**
     * Prints every seat number that appears more than once. Uses O(n^2)
     * pairwise comparison — no Collections.
     */
    public static void checkDuplicateSeats(int[] seatNumbers) {
        if (seatNumbers == null || seatNumbers.length < 2) {
            System.out.println("No Duplicate Seats Found");
            return;
        }

        boolean anyDuplicate = false;
        boolean[] alreadyReported = new boolean[seatNumbers.length];

        for (int i = 0; i < seatNumbers.length; i++) {
            if (alreadyReported[i]) continue;
            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    alreadyReported[j] = true; // don't print the same dup twice
                    anyDuplicate = true;
                }
            }
        }

        if (!anyDuplicate) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    private static String arrToString(int[] a) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(", ");
        }
        return sb.append("}").toString();
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {101, 102, 103, 102, 105},
            {101, 102, 103, 104, 105},
            {7, 7, 7, 7},
            {1, 2, 3, 2, 4, 3}
        };
        for (int[] t : testCases) {
            System.out.print("Input: " + arrToString(t) + "  =>  ");
            checkDuplicateSeats(t);
        }
    }
}
