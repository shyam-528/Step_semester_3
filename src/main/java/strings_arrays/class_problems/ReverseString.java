package strings_arrays.class_problems;

/**
 * ReverseString
 *
 * Reverses a given string using a simple character-array approach.
 *
 * Example:
 *   input  : "hello"
 *   output : "olleh"
 */
public class ReverseString {

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverse(original);
        System.out.println("Original : " + original);
        System.out.println("Reversed : " + reversed);
    }
}
