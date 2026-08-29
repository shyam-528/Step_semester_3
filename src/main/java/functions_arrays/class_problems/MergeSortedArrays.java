package functions_arrays.class_problems;

/**
 * MergeSortedArrays
 *
 * Session 4 - LeetCode Practice, Category C, Problem L4: Merge Two Sorted
 * Arrays.
 *
 * Merges two already-sorted int arrays into one fully sorted result using a
 * two-pointer while loop, without re-sorting from scratch.
 *
 * Suggested method signature: int[] mergeSortedArrays(int[] arr1, int[] arr2)
 */
public class MergeSortedArrays {

    /** Merges two ascending int arrays into a single ascending array. */
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        if (arr1 == null) {
            arr1 = new int[0];
        }
        if (arr2 == null) {
            arr2 = new int[0];
        }

        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    private static String arrToString(int[] a) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i < a.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }

    public static void main(String[] args) {
        int[][] a1 = { {1, 3, 5}, {}, {2, 5, 7, 9} };
        int[][] a2 = { {2, 4, 6}, {1, 2, 3}, {0, 8} };

        for (int t = 0; t < a1.length; t++) {
            System.out.println("arr1 = " + arrToString(a1[t]) + ", arr2 = " + arrToString(a2[t])
                    + "  =>  " + arrToString(mergeSortedArrays(a1[t], a2[t])));
        }
    }
}
