package strings_arrays.class_problems;

/**
 * ReverseCustomerName
 *
 * Week 1 Assessment - Problem 5: The Customer Identity Verification System.
 *
 * Returns a reversed copy of the supplied customer name. The original
 * string is left unchanged (strings are immutable in Java, so callers
 * cannot accidentally mutate it).
 *
 * Suggested method signature: String reverseCustomerName(String customerName)
 */
public class ReverseCustomerName {

    /**
     * Returns a new string that is the reverse of {@code customerName}.
     *
     * @param customerName the name to reverse
     * @return a new string containing the characters in reverse order
     */
    public static String reverseCustomerName(String customerName) {
        if (customerName == null) {
            return null;
        }
        char[] original = customerName.toCharArray();
        char[] reversed = new char[original.length];

        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i];
        }
        return new String(reversed);
    }

    public static void main(String[] args) {
        String[] names = {"Sunil", "Shyam", "Priya", "Akshay"};

        for (String name : names) {
            String reversed = reverseCustomerName(name);
            System.out.println("Original Name: " + name);
            System.out.println("Reversed Name: " + reversed);
            System.out.println();
        }
    }
}
