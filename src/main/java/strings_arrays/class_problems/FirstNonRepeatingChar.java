package strings_arrays.class_problems;

/**
 * FirstNonRepeatingChar
 *
 * Week 1 Assessment - Problem 4: The Unique Letter Hunt Mini-Game.
 *
 * Accepts any word or short sentence, computes the frequency of every
 * character, and returns the first character that appears exactly once.
 *
 * Suggested method signature: char findFirstNonRepeatingChar(String text)
 *   - Returns 0 (NUL) if no non-repeating character exists, OR
 *   - Throws NoSuchElementException / returns a sentinel and the caller prints
 *     "No Non-Repeating Character Found" — see main() for the messaging logic.
 */
public class FirstNonRepeatingChar {

    /** Sentinel value meaning "no non-repeating character found". */
    public static final char NONE = '\0';

    /**
     * Find the first character that appears exactly once in the input.
     *
     * @return the first non-repeating char, or {@link #NONE} if none exists.
     */
    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return NONE;
        }

        int[] frequency = new int[256]; // covers extended ASCII

        // Count frequencies (case-sensitive by design; lowercase via toLowerCase() if preferred).
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            frequency[c]++;
        }

        // Scan left to right; the first char with count == 1 is our answer.
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (frequency[c] == 1) {
                return c;
            }
        }
        return NONE;
    }

    public static void main(String[] args) {
        String[] inputs = {"swiss", "aabbcc", "stress", "programming", "abcabc"};

        for (String input : inputs) {
            char result = findFirstNonRepeatingChar(input);
            if (result == NONE) {
                System.out.println("Input: \"" + input + "\"  =>  No Non-Repeating Character Found");
            } else {
                System.out.println("Input: \"" + input + "\"  =>  First Non-Repeating Character: '"
                        + result + "'");
            }
        }
    }
}
