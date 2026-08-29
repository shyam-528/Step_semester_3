package arrays_loops.class_problems;

/**
 * TypingAccuracy
 *
 * Week 3 Assessment - Problem 2: The Typing Speed Test Accuracy Checker.
 *
 * Compares a user's typed text to the original passage character by
 * character and reports the number of matches, the accuracy percentage, and
 * the position of the first mismatch.
 *
 * Suggested method signature: void checkTypingAccuracy(String original, String typed)
 */
public class TypingAccuracy {

    /** Compares two equal-length strings char by char and prints a report. */
    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Input strings must not be null.");
            return;
        }

        int total = original.length();
        if (typed.length() < total) {
            total = typed.length();
        }

        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i;
            }
        }

        double accuracy = (total == 0) ? 0.0 : (matched * 100.0) / total;

        if (firstMismatch == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, total, accuracy);
        } else {
            int pos = firstMismatch + 1;
            char origChar = original.charAt(firstMismatch);
            char typedChar = typed.charAt(firstMismatch);
            System.out.printf(
                    "Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, pos, origChar, typedChar);
        }
    }

    public static void main(String[] args) {
        Object[][] cases = {
            {"hello world", "hello worlt"},
            {"coding", "coding"},
            {"java", "jiva"},
            {"abcdef", "abcXef"}
        };
        for (Object[] c : cases) {
            String o = (String) c[0];
            String t = (String) c[1];
            System.out.print("original=\"" + o + "\", typed=\"" + t + "\"  =>  ");
            checkTypingAccuracy(o, t);
        }
    }
}
