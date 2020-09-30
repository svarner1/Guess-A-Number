import java.util.Scanner;

public class Guess_A_Number {
	public static void main(String[] args) {
		int guess;
		int guessCount = 0;
		Scanner console = new Scanner(System.in);
		System.out.println("Guess the secret number.");
		
		System.out.println("Enter the maximum value for secret number: ");
		int maxNum = console.nextInt();
		while(maxNum < 1) {
			System.out.println("Please enter an integer greater than 0 :");
			maxNum = console.nextInt();
		}
		
		int secretNum = (int)(Math.random()* maxNum) + 1;
		System.out.println("A new secret number has been chosen.");
		System.out.println("Enter guess: ");
		guess = console.nextInt();
		guessCount++;
		while (guess!= secretNum) {
			if(guess < secretNum) {
				System.out.println("Too low; try again.");
			}
			if(guess> secretNum) {
				System.out.println("Too high; try again.");
			}
			System.out.println("Enter Guess: ");
			guessCount++;
			guess = console.nextInt();
		}
		if (guessCount >1) {
			System.out.println("You won in " + guessCount + " guesses!" );
		} else {
			System.out.println("You won in " + guessCount + " guess!" );
		}
		System.out.println("Play again? (Y/N): ");
		String answer = console.next();
		answer.trim();
		boolean check = answer.equalsIgnoreCase("y");
		
		while (check == true) {
			guessCount = 0;
			secretNum = (int)(Math.random()* maxNum) + 1;
			System.out.println("A new secret number has been chosen.");
			System.out.println("Enter guess: ");
			guess = console.nextInt();
			guessCount++;
			while (guess!= secretNum) {
				guessCount++;
				if(guess < secretNum) {
					System.out.println("Too low; try again.");
				}
				if(guess> secretNum) {
					System.out.println("Too high; try again.");
				}
				System.out.println("Enter Guess: ");
				guess = console.nextInt();
			}
			if (guessCount > 1) {
				System.out.println("You won in " + guessCount + " guesses!" );
			} else {
				System.out.println("You won in " + guessCount + " guess!" );
			}
			System.out.println("Play again? (Y/N)");
			answer = console.next();
			answer.trim();
			check = answer.equalsIgnoreCase("y");
		}
	}
			
}
