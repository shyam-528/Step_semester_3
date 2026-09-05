package arrays_methods.class_problems;

import java.util.Arrays;

/**
 * HackathonScoreBooster
 *
 * Session 6 - Category C, Problem 1 (Easy): Hackathon Score Curve Booster.
 *
 * Boosts every hackathon score in place by a flat bonus — no new array, no
 * return value — then prints the leaderboard with Arrays.toString(...).
 *
 * Function signature: static void curveScores(int[] scores, int bonus)
 */
public class HackathonScoreBooster {

    /** Adds bonus to every element of the caller's own array, in place. */
    static void curveScores(int[] scores, int bonus) {
        if (scores == null) {
            return;
        }
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores));

        int[] empty = {};
        curveScores(empty, 5);
        System.out.println(Arrays.toString(empty));

        int[] negativeBonus = {50, 60};
        curveScores(negativeBonus, 0);
        System.out.println(Arrays.toString(negativeBonus));
    }
}
