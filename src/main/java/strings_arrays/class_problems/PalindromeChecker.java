package strings_arrays.class_problems;

/**
 * PalindromeChecker
 *
 * Week 1 Assessment - Problem 2: The QA Text Verification Toolkit.
 *
 * Verifies whether a given text is a palindrome using THREE independent
 * approaches (iterative, recursive, array-reversal) and prints all three
 * results so they can be cross-checked.
 *
 * Suggested method signatures:
 *   boolean isPalindromeIterative(String text)
 *   boolean isPalindromeRecursive(String text)
 *   boolean isPalindromeArrayReversal(String text)
 */
public class PalindromeChecker {

    /** Iterative: compare characters from both ends moving toward the middle. */
    public static boolean isPalindromeIterative(String text) {
        if (text == null) {
            return false;
        }
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /** Recursive: compare first and last chars, shrink substring each call. */
    public static boolean isPalindromeRecursive(String text) {
        if (text == null) {
            return false;
        }
        if (text.length() <= 1) {
            return true;
        }
        if (text.charAt(0) != text.charAt(text.length() - 1)) {
            return false;
        }
        return isPalindromeRecursive(text.substring(1, text.length() - 1));
    }

    /** Array reversal: convert to char[], reverse, compare to the original. */
    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) {
            return false;
        }
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    private static String verdict(boolean b) {
        return b ? "Palindrome" : "Not Palindrome";
    }

    public static void main(String[] args) {
        String[] inputs = {"madam", "hello", "racecar", "level", "world"};

        for (String input : inputs) {
            boolean iter   = isPalindromeIterative(input);
            boolean rec    = isPalindromeRecursive(input);
            boolean revArr = isPalindromeArrayReversal(input);

            System.out.println("Input: \"" + input + "\"");
            System.out.println("  Iterative:      " + verdict(iter));
            System.out.println("  Recursive:      " + verdict(rec));
            System.out.println("  Array Reversal: " + verdict(revArr));
            System.out.println();
        }
    }
}
