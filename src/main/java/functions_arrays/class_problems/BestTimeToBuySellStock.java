package functions_arrays.class_problems;

/**
 * BestTimeToBuySellStock
 *
 * Session 4 - LeetCode Practice, Category C, Problem L2: Best Time to Buy and
 * Sell Stock.
 *
 * Given daily stock prices, finds the maximum profit obtainable by buying on
 * one day and selling on a later day, in a single left-to-right pass.
 *
 * Suggested method signature: int maxProfit(int[] prices)
 */
public class BestTimeToBuySellStock {

    /**
     * Tracks the lowest price seen so far and the largest profit achievable by
     * selling at the current day. Returns 0 if no profitable trade exists.
     */
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
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
        int[][] cases = {
            {7, 1, 5, 3, 6, 4},
            {7, 6, 4, 3, 1},
            {1, 2, 3, 4, 5},
            {3}
        };
        for (int[] p : cases) {
            System.out.println("prices = " + arrToString(p) + "  =>  " + maxProfit(p));
        }
    }
}
