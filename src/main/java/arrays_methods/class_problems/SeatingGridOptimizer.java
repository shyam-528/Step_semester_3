package arrays_methods.class_problems;

/**
 * SeatingGridOptimizer
 *
 * Session 6 - Category C, Problem 4 (Intermediate): Hackathon Seating Grid
 * Optimizer.
 *
 * Classifies every row of a (possibly jagged) seating grid as a Quiet Zone or
 * a Buzzing Zone against a threshold, delegating all averaging to one small
 * reusable helper method.
 *
 * Function signatures:
 *   static double rowAverage(int[] row)
 *   static String classifyRows(int[][] seatingScores, int threshold)
 */
public class SeatingGridOptimizer {

    /** Computes one row's average — nothing else. Handles a jagged grid. */
    static double rowAverage(int[] row) {
        if (row == null || row.length == 0) {
            return 0.0;
        }
        long sum = 0;
        for (int v : row) {
            sum += v;
        }
        return (double) sum / row.length;
    }

    /** The only place Quiet vs. Buzzing is decided. */
    static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null || seatingScores.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < seatingScores.length; r++) {
            double avg = rowAverage(seatingScores[r]);
            String zone = (avg < threshold) ? "Quiet Zone" : "Buzzing Zone";
            sb.append("Row ").append(r).append(": ").append(zone);
            if (r < seatingScores.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] grid1 = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        System.out.println(classifyRows(grid1, 60));

        int[][] jagged = {
            {10},
            {70, 75, 80, 85},
            {60, 59}
        };
        System.out.println(classifyRows(jagged, 60));
    }
}
