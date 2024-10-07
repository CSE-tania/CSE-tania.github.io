// Copyright Tania Charles;

// Program to simulate a game of Rock, Paper, Scissors
package rockpaperscissors;
import java.util.Random;
import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        boolean playAgain; // Variable to track if the player wants to play again

        do {
            int playerScore = 0; // Initialize player score
            int computerScore = 0; // Initialize computer score

            // Play 3 rounds of the game
            for (int round = 1; round <= 3; round++) {
                System.out.print("Round " + round + ": Enter rock, paper, or scissors: ");
                String playerChoice = scanner.nextLine().toLowerCase(); // Get player's choice

                // Validate player input
                if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                    System.out.println("Invalid input! The computer scores a point.");
                    computerScore++;
                    continue; // Skip to the next round
                }

                // Computer's random choice
                String computerChoice = getComputerChoice(random);
                System.out.println("Computer chose: " + computerChoice);

                // Determine the round winner
                int result = determineWinner(playerChoice, computerChoice);
                if (result == 1) {
                    System.out.println("You win this round!");
                    playerScore++;
                } else if (result == -1) {
                    System.out.println("Computer wins this round!");
                    computerScore++;
                } else {
                    System.out.println("It's a draw!");
                }
            }

            // Declare overall winner
            System.out.println("Final Scores: You - " + playerScore + " | Computer - " + computerScore);
            if (playerScore > computerScore) {
                System.out.println("You are the overall winner!");
            } else if (computerScore > playerScore) {
                System.out.println("The computer is the overall winner!");
            } else {
                System.out.println("It's a tie!");
            }

            // Ask if the player wants to play again
            System.out.print("Do you want to play again? (Yes/No): ");
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes"); // Check for "yes" to continue

        } while (playAgain); // Continue if player wants to play again

        System.out.println("Thank you for playing!"); // Exit message
        scanner.close(); // Close the scanner
    }

    // Method to get the computer's choice
    private static String getComputerChoice(Random random) {
        int choice = random.nextInt(3); // Generate a random number (0-2)
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            default:
                return "scissors";
        }
    }

    // Method to determine the winner of a round
    private static int determineWinner(String player, String computer) {
        if (player.equals(computer)) {
            return 0; // Draw
        }
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return 1; // Player wins
        }
        return -1; // Computer wins
    }
}



