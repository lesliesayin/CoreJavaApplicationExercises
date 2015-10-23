package interactiveJavaApplications;

import java.util.Random;
import java.util.Scanner;

public class GuessInteger {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random randomNumber = new Random();
		int continueOrExit;

		do {
			int number = 1 + randomNumber.nextInt(1000);
			System.out.print("Guess a number between 1-1000 : ");
			int guess = input.nextInt();

			while (guess != number) {
				if (guess > number) {
					System.out.println("Too High");
				} else if (guess < number) {
					System.out.println("Too Low");
				}
				System.out.print("Guess a number between 1-1000 : ");
				guess = input.nextInt();
			}

			System.out.println("Congratulations you've guessed the number " + number);
			System.out.println("Want to play again?");
			System.out.print("1-continue or 2- exit : ");
			continueOrExit = input.nextInt();

		} while (continueOrExit == 1);

		System.out.println("Thank you for playing");

		input.close();
	}
}
