package arrays_loops.class_problems;

/**
 * WordLengthProfiler
 *
 * Week 3 Assessment - Problem 5: The Movie Review Word Length Profiler.
 *
 * Splits a movie review into individual words and counts how many fall into
 * each length bucket: Short (1-4), Medium (5-8), Long (9+).
 *
 * Suggested method signature: void classifyWordLengths(String review)
 */
public class WordLengthProfiler {

    private static final int SHORT_MAX = 4;
    private static final int MEDIUM_MAX = 8;

    /** Splits the review on whitespace and counts word-length buckets. */
    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        int shortCount = 0, mediumCount = 0, longCount = 0;

        String[] words = review.trim().split("\\s+");

        for (String w : words) {
            int len = w.length();
            if (len <= SHORT_MAX) {
                shortCount++;
            } else if (len <= MEDIUM_MAX) {
                mediumCount++;
            } else {
                longCount++;
            }
        }

        System.out.println("Short: " + shortCount + " | Medium: " + mediumCount + " | Long: " + longCount);
    }

    public static void main(String[] args) {
        String[] reviews = {
            "This movie was absolutely fantastic and thrilling",
            "Good",
            "A masterpiece of cinema with breathtaking performances and a deeply moving storyline",
            "I loved it"
        };
        for (String r : reviews) {
            System.out.print("\"" + r + "\"  =>  ");
            classifyWordLengths(r);
        }
    }
}
