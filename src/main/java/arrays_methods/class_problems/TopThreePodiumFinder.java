package arrays_methods.class_problems;

import java.util.Arrays;

/**
 * TopThreePodiumFinder
 *
 * Session 6 - Category C, Problem 3 (Intermediate): Top-3 Podium Finder.
 *
 * Finds the top 3 scores in a single left-to-right pass, without sorting —
 * three running variables shift down whenever a new score beats one of them.
 *
 * Function signature: static int[] findTopThreeScores(int[] scores)
 */
public class TopThreePodiumFinder {

    /** Single-pass top-3; returns {first, second, third} in descending order. */
    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int s : scores) {
            if (s >= first) {
                third = second;
                second = first;
                first = s;
            } else if (s >= second) {
                third = second;
                second = s;
            } else if (s > third) {
                third = s;
            }
        }

        return new int[] {first, second, third};
    }

    public static void main(String[] args) {
        int[][] cases = {
            {45, 82, 79, 90, 33, 90, 61},
            {5, 5, 5},
            {1, 2, 3},
            {100, 99, 1, 99, 100},
            {10, 20, 30, 40, 50}
        };
        for (int[] s : cases) {
            System.out.println(Arrays.toString(s) + "  =>  "
                    + Arrays.toString(findTopThreeScores(s)));
        }
    }
}
