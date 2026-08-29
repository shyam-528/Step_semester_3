package arrays_loops.class_problems;

/**
 * TrafficSignalStreak
 *
 * Week 2 Assessment - Problem 3: The Traffic Signal Streak Analyzer.
 *
 * Scans a string of single-letter signal readings ('R','Y','G') and reports
 * the longest run of identical consecutive characters.
 *
 * Suggested method signature: void findLongestStreak(String signalLog)
 */
public class TrafficSignalStreak {

    /** Scans the signal log and prints the longest run of identical chars. */
    public static void findLongestStreak(String signalLog) {
        if (signalLog == null || signalLog.isEmpty()) {
            System.out.println("Signal log is empty.");
            return;
        }

        char bestChar = signalLog.charAt(0);
        int bestLen = 1;

        char curChar = signalLog.charAt(0);
        int curLen = 1;

        for (int i = 1; i < signalLog.length(); i++) {
            char c = signalLog.charAt(i);
            if (c == curChar) {
                curLen++;
            } else {
                curChar = c;
                curLen = 1;
            }
            if (curLen > bestLen) {
                bestLen = curLen;
                bestChar = curChar;
            }
        }

        System.out.println("Longest Streak: '" + bestChar + "' repeated " + bestLen + " times");
    }

    public static void main(String[] args) {
        String[] logs = {
            "RRGGGYRR",
            "RRRRYYGG",
            "RGYRGYRG",
            "GGGGG",
            "YYRGGGGR"
        };
        for (String s : logs) {
            System.out.print("\"" + s + "\"  =>  ");
            findLongestStreak(s);
        }
    }
}
