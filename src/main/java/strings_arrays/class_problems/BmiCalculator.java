package strings_arrays.class_problems;

import java.util.Random;

/**
 * BmiCalculator
 *
 * Week 1 Assessment - Problem 3: The Corporate Wellness Program.
 *
 * Computes BMI for a team of people and classifies their health status.
 * Uses parallel arrays for heights and weights (random values for a live demo).
 *
 * Suggested method signatures:
 *   String getBmiStatus(double bmi)
 *   void printWellnessReport(double[] heights, double[] weights)
 */
public class BmiCalculator {

    /** Classify BMI: <18.5 Underweight, 18.5-24.9 Normal, 25-29.9 Overweight, >=30 Obese. */
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    /** Print a wellness report table for the given team. */
    public static void printWellnessReport(double[] heights, double[] weights) {
        if (heights == null || weights == null || heights.length != weights.length) {
            throw new IllegalArgumentException("Heights and weights arrays must be the same length and non-null");
        }

        System.out.printf("%-8s | %-12s | %-12s | %-8s | %-12s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double h = heights[i];
            double w = weights[i];
            double bmi = w / (h * h);
            String status = getBmiStatus(bmi);
            System.out.printf("%-8d | %-12.2f | %-12.2f | %-8.2f | %-12s%n",
                    (i + 1), h, w, bmi, status);
        }
    }

    public static void main(String[] args) {
        final int TEAM_SIZE = 10;
        double[] heights = new double[TEAM_SIZE];
        double[] weights = new double[TEAM_SIZE];

        Random random = new Random(42); // fixed seed for reproducible demo

        // Random heights 1.50-1.95 m, random weights 50-110 kg
        for (int i = 0; i < TEAM_SIZE; i++) {
            heights[i] = 1.50 + (1.95 - 1.50) * random.nextDouble();
            weights[i] = 50   + (110 - 50)   * random.nextDouble();
        }

        printWellnessReport(heights, weights);
    }
}
