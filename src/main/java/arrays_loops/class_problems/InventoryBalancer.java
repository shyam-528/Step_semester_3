package arrays_loops.class_problems;

/**
 * InventoryBalancer
 *
 * Week 2 Assessment - Problem 4: The Warehouse Inventory Balancer.
 *
 * Compares two int arrays (Section A, Section B) item-by-item, reports
 * whether the totals are balanced, and finds the single highest quantity
 * along with which section and index it lives in.
 *
 * Suggested method signature: void analyzeInventory(int[] sectionA, int[] sectionB)
 */
public class InventoryBalancer {

    /**
     * Analyzes two same-length int arrays. Throws IllegalArgumentException
     * if either is null or they have different lengths.
     */
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        if (sectionA == null || sectionB == null) {
            throw new IllegalArgumentException("Arrays must not be null");
        }
        if (sectionA.length != sectionB.length) {
            throw new IllegalArgumentException(
                "Sections must have the same number of items (A=" + sectionA.length
                + ", B=" + sectionB.length + ")");
        }

        int totalA = 0, totalB = 0;
        for (int v : sectionA) totalA += v;
        for (int v : sectionB) totalB += v;

        String balance = (totalA == totalB) ? "Balanced" : "Not Balanced";

        // Find the single highest quantity across both arrays, with location.
        int highest = Integer.MIN_VALUE;
        String whereSection = "";
        int whereIndex = -1; // 0-indexed

        for (int i = 0; i < sectionA.length; i++) {
            if (sectionA[i] > highest) {
                highest = sectionA[i];
                whereSection = "Section A";
                whereIndex = i;
            }
        }
        for (int i = 0; i < sectionB.length; i++) {
            if (sectionB[i] > highest) {
                highest = sectionB[i];
                whereSection = "Section B";
                whereIndex = i;
            }
        }

        // User-facing report uses 1-indexed item numbers.
        System.out.printf(
            "Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)%n",
            totalA, totalB, balance, highest, whereSection, whereIndex + 1);
    }

    private static String arrToString(int[] a) {
        StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) sb.append(", ");
        }
        return sb.append("}").toString();
    }

    public static void main(String[] args) {
        int[][] a = { {20, 15, 30}, {5, 10, 15}, {100, 0, 50} };
        int[][] b = { {25, 10, 30}, {5, 10, 20}, {10, 10, 10} };

        for (int i = 0; i < a.length; i++) {
            System.out.print("sectionA=" + arrToString(a[i])
                    + ", sectionB=" + arrToString(b[i]) + "  =>  ");
            analyzeInventory(a[i], b[i]);
        }
    }
}
