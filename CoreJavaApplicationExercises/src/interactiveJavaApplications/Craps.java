package interactiveJavaApplications;

import java.util.Random;

public class Craps{

	private static final Random randomNumbers = new Random();
	public static void main(String args[]) {
		gameStatus();
	}

	public static void gameStatus() {
		int total = rollDice();

		if((total == 7) || (total == 11)) {
			System.out.println("Player Wins");
		}
		else if((total <= 3) || (total == 12)) {
			System.out.println("Player Lose");
		}
		else {
			System.out.println("Point is : " + total);
			continueRolling(total);
		}
			
	}

	public static int rollDice() {
		int dice1 = 1 + randomNumbers.nextInt(6);
		int dice2 = 1 + randomNumbers.nextInt(6);
		int total = dice1 + dice2;

		System.out.println("Player rolled " + 
			+ dice1 + " + " + dice2 + " = " + total);

		return total;
	}

	public static void continueRolling(int point) {
		int total = rollDice();

		if(total == point) {
			System.out.println("Player Wins");	
		}
		else if(total == 7) {
			System.out.println("Player Lose");
		}
		else {
			continueRolling(point);
		}
	}
}
