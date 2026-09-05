package arrays_methods.class_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * PlacementRankingEngine
 *
 * Session 6 - Category C, Problem 5 (Advanced): Placement Drive
 * Shortlisting & Ranking Engine.
 *
 * Shortlists placement candidates through two overloaded eligibility checks
 * (a CGPA-only bar, plus a combined CGPA + coding-score check for borderline
 * cases) and ranks the shortlist by composite score, descending, letting
 * Arrays.sort(...) do the sorting via Comparable.
 *
 * Eligibility rules (chosen per the problem's guidance):
 *   - CGPA-only quick filter: cgpa >= 7.0 qualifies outright.
 *   - Borderline combined filter: cgpa >= 6.5 AND codingScore >= 60.
 * Composite score = cgpa * 10 + codingScore * 0.5.
 */
public class PlacementRankingEngine {

    /** Candidate with a constructor, encapsulated fields, and Comparable. */
    static class Candidate implements Comparable<Candidate> {
        private final String name;
        private final double cgpa;
        private final int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public String getName() { return name; }
        public double getCgpa() { return cgpa; }
        public int getCodingScore() { return codingScore; }

        public double compositeScore() {
            return cgpa * 10 + codingScore * 0.5;
        }

        /** Descending order by composite score. */
        @Override
        public int compareTo(Candidate other) {
            return Double.compare(other.compositeScore(), this.compositeScore());
        }
    }

    /** CGPA-only quick filter. */
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.0;
    }

    /** Combined CGPA-and-coding-score filter for borderline cases. */
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    /** Shortlists via the overloaded checks, then ranks with Arrays.sort. */
    static String shortlistAndRank(Candidate[] candidates) {
        if (candidates == null || candidates.length == 0) {
            return "";
        }

        List<Candidate> shortlisted = new ArrayList<>();
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa()) || isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted.add(c);
            }
        }

        Candidate[] ranked = shortlisted.toArray(new Candidate[0]);
        Arrays.sort(ranked); // Comparable does all the ranking

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ranked.length; i++) {
            sb.append(i + 1).append(". ")
              .append(ranked[i].getName())
              .append(" (").append(ranked[i].compositeScore()).append(")");
            if (i < ranked.length - 1) {
                sb.append(" | ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Candidate[] batch1 = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(batch1));

        Candidate[] batch2 = {
            new Candidate("Zara", 9.1, 88),
            new Candidate("Dev", 6.9, 58),
            new Candidate("Nia", 7.0, 0),
            new Candidate("Omar", 5.5, 100)
        };
        System.out.println(shortlistAndRank(batch2));
    }
}
