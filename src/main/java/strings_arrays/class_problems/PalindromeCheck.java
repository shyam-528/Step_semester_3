package strings_arrays.class_problems;

/**
 * PalindromeCheck
 *
 * Checks whether a given string is a palindrome
 * (reads the same forwards and backwards, ignoring case and non-alphanumeric chars).
 *
 * Example:
 *   "racecar"  -> true
 *   "RaceCar"  -> true
 *   "hello"    -> false
 */
public class PalindromeCheck {

    public static boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] tests = {"racecar", "RaceCar", "A man a plan a canal Panama", "hello", "Madam", "12321"};
        for (String t : tests) {
            System.out.printf("%-30s -> %b%n", t, isPalindrome(t));
        }
    }
}
