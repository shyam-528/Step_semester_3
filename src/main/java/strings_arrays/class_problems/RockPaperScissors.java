package strings_arrays.class_problems;

import java.util.Random;

/**
 * RockPaperScissors
 *
 * Week 1 Assessment - Problem 1: The College Coding Arcade.
 *
 * Plays N rounds of Rock-Paper-Scissors between the player and the computer,
 * records the outcome of every round, and prints a final scoreboard with
 * wins, losses, draws, and the player's win percentage.
 *
 * Suggested method signature: String playRound(String playerMove, String computerMove)
 */
public class RockPaperScissors {

    private static final String[] MOVES = {"Rock", "Paper", "Scissors"};
    private static final int TOTAL_ROUNDS = 5;

    /**
     * Determines the result of a single Rock-Paper-Scissors round.
     *
     * @return "Player Wins" | "Computer Wins" | "Draw"
     */
    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        boolean playerWins =
                (playerMove.equalsIgnoreCase("Rock")     && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"))    ||
                (playerMove.equalsIgnoreCase("Paper")    && computerMove.equalsIgnoreCase("Rock"));
        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        // Predefined player moves for a live demo (one per round).
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        String[] roundPlayers  = new String[TOTAL_ROUNDS];
        String[] roundComputers = new String[TOTAL_ROUNDS];
        String[] roundResults   = new String[TOTAL_ROUNDS];

        int wins = 0, losses = 0, draws = 0;

        Random random = new Random();

        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            String playerMove = playerMoves[i];
            String computerMove = MOVES[random.nextInt(MOVES.length)];
            String result = playRound(playerMove, computerMove);

            roundPlayers[i]   = playerMove;
            roundComputers[i] = computerMove;
            roundResults[i]   = result;

            if (result.equals("Player Wins"))      wins++;
            else if (result.equals("Computer Wins")) losses++;
            else                                    draws++;

            System.out.println("Round " + (i + 1) + " - Player: " + playerMove
                    + ", Computer: " + computerMove + "  =>  " + result);
        }

        double winPercentage = (wins * 100.0) / TOTAL_ROUNDS;

        System.out.println();
        System.out.println("========== Final Summary ==========");
        System.out.printf("%-8s | %-13s | %-15s | %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < TOTAL_ROUNDS; i++) {
            System.out.printf("%-8d | %-13s | %-15s | %-15s%n",
                    (i + 1), roundPlayers[i], roundComputers[i], roundResults[i]);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n",
                wins, losses, draws, winPercentage);
    }
}
