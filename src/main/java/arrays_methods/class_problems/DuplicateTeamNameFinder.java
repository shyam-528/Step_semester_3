package arrays_methods.class_problems;

/**
 * DuplicateTeamNameFinder
 *
 * Session 6 - Category C, Problem 2 (Easy): Duplicate Team Name Finder.
 *
 * Scans the registered team names with plain nested loops (no Collections)
 * and reports the first duplicate found, scanning in order.
 *
 * Function signature: static String findDuplicateTeam(String[] teamNames)
 */
public class DuplicateTeamNameFinder {

    /** Compares each name only against the names after it. */
    static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null) {
            return "No Duplicates Found";
        }
        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i].equals(teamNames[j])) {
                    return "Duplicate Found: " + teamNames[i];
                }
            }
        }
        return "No Duplicates Found";
    }

    public static void main(String[] args) {
        String[][] cases = {
            {"ByteForce", "CodeCrafters", "ByteForce"},
            {"ByteForce", "CodeCrafters", "NullPointers"},
            {"Alpha", "Beta", "Gamma", "Beta", "Alpha"}
        };
        for (String[] teams : cases) {
            System.out.println(java.util.Arrays.toString(teams) + "  =>  "
                    + findDuplicateTeam(teams));
        }
    }
}
