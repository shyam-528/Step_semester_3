package arrays_loops.class_problems;

/**
 * TypingAccuracy
 *
 * Week 2 Assessment - Problem 2: The Typing Speed Test Accuracy Checker.
 *
 * Compares a typed string to the original passage char by char and reports
 * match count, accuracy percentage, and position of the first mismatch.
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
        if (original.length() != typed.length()) {
            System.out.println("Strings differ in length (original="
                    + original.length() + ", typed=" + typed.length()
                    + "). Proceeding with min length.");
        }

        int total = Math.min(original.length(), typed.length());
        int matched = 0;
        int firstMismatch = -1;

        for (int i = 0; i < total; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatch == -1) {
                firstMismatch = i; // 0-indexed; user output uses 1-indexed position
            }
        }

        double accuracy = (total == 0) ? 0.0 : (matched * 100.0) / total;

        if (firstMismatch == -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, total, accuracy);
        } else {
            int pos = firstMismatch + 1; // convert to 1-indexed
            char origChar = original.charAt(firstMismatch);
            char typedChar = typed.charAt(firstMismatch);
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, total, accuracy, pos, origChar, typedChar);
        }
    }

    public static void main(String[] args) {
        Object[][] cases = {
            {"hello world", "hello worlt"},
            {"coding",      "coding"},
            {"java",        "jiva"},
            {"abcdef",      "abcXef"}
        };
        for (Object[] c : cases) {
            String o = (String) c[0];
            String t = (String) c[1];
            System.out.print("original=\"" + o + "\", typed=\"" + t + "\"  =>  ");
            checkTypingAccuracy(o, t);
        }
    }
}
