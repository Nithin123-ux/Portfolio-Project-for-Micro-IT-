package com.game;

		import java.util.Random;
		import java.util.Scanner;

		public class rockPaperScissor {

		    public static void main(String[] args) {

		        // Create Scanner object for input
		        Scanner scanner = new Scanner(System.in);
		        
		        // Game instructions
		        System.out.println("Rock, Paper, Scissors Game!");
		        System.out.print("Enter your choice: Rock, Paper, or Scissors : ");
		        
		        // Get player's choice
		        String playerChoice = scanner.nextLine().toLowerCase();

		        // Validate the input
		        if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
		            System.out.println("Invalid choice! Please choose Rock, Paper, or Scissors.");
		            return; // Exit the game if invalid input
		        }

		        // Get computer's choice (randomly)
		        String computerChoice = getComputerChoice();

		        // Print choices
		        System.out.println("Your choice: " + playerChoice);
		        System.out.println("Computer's choice: " + computerChoice);

		        // Determine the winner
		        String result = determineWinner(playerChoice, computerChoice);

		        // Display the result
		        System.out.println(result);

		        // Close the scanner
		        scanner.close();
		    }

		    // Method to get computer's choice (random)
		    private static String getComputerChoice() {
		        Random random = new Random();
		        int choice = random.nextInt(3); // Generates 0, 1, or 2
		        switch (choice) {
		            case 0: return "rock";
		            case 1: return "paper";
		            case 2: return "scissors";
		            default: return "rock"; // Default case
		        }
		    }

		    // Method to determine the winner
		    private static String determineWinner(String player, String computer) {
		        if (player.equals(computer)) {
		            return "It's a tie!";
		        }

		        // Player wins
		        if ((player.equals("rock") && computer.equals("scissors")) ||
		            (player.equals("scissors") && computer.equals("paper")) ||
		            (player.equals("paper") && computer.equals("rock"))) {
		            return "You win!";
		        }

		        // Computer wins
		        return "Computer wins!";
		    }
		}


	
