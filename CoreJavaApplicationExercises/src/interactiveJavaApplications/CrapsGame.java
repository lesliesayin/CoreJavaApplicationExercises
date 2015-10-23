package interactiveJavaApplications;

import java.util.Random;
import java.util.Scanner;

public class CrapsGame{
	private static final Random randomNumbers = new Random();
	private static final Scanner input = new Scanner(System.in);
	private static enum Status{WON, LOST}
	private static Status gameStatus;
	private static int playerBankBalance;
	private static int playerWager;
	private static final int CONTINUE = 1;
	private static final int EXIT = 0;
	private static int continueOrExit;
	public static void main(String args[]) {
		setBankBalance();
		do {
			displayBankBalance();
			setWager();
			game();
			updatePlayerBankBalance();
			displayGameStatus();
			displayChatter();
			displayBankBalance();
			if(playerBankBalance != 0) {
				continueOrExit();	
			} 
			else {
				break;
			}
		} while(continueOrExit == CONTINUE);
		
		System.out.println("Thank You for Playing");
	}
	
	public static void game() {
		int total = rollDice();

		if((total == 7) || (total == 11)) {
			gameStatus = Status.WON;
		}
		else if((total <= 3) || (total == 12)) {
			gameStatus = Status.LOST;
		}
		else {
			System.out.println("Point is : " + total);
			continueRolling(total);
		}
			
	}

	public static void setBankBalance() {
		System.out.print("Enter Bank Balance : "); 
		int bankBalance = input.nextInt();

		while(bankBalance <= 0) {
			System.out.println("Invalid Input");
			System.out.print("Enter Bank Balance : "); 
			bankBalance = input.nextInt();
		}
	
		playerBankBalance = bankBalance;
	}

	public static void setWager() {
		int wager;
		do {
			System.out.print("Enter Wager : "); 
			wager = input.nextInt();

			if(wager <= 0) {
				System.out.println("Invalid Input");
			}
			else if(wager > playerBankBalance) {
				System.out.println("Wager exceeds bank balance");
			}
		}while((wager <= 0) || (wager > playerBankBalance));

		playerWager = wager;
	}

	public static void updatePlayerBankBalance() {
		if(gameStatus == Status.WON) {
			playerBankBalance = playerBankBalance + playerWager;
		}
		else if(gameStatus == Status.LOST) {
			playerBankBalance = playerBankBalance - playerWager;
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
			gameStatus = Status.WON;
		}
		else if(total == 7) {
			gameStatus = Status.LOST;
		}
		else {
			continueRolling(point);
		}
	}

	public static void displayChatter() {
		int chatterPicker = 1 + randomNumbers.nextInt(2);

		final int FIRST_CHATTER = 1;
		final int SECOND_CHATTER = 2;
		
		if(gameStatus == Status.WON) {
			System.out.println("You're up big. Now's the time to cash in your chips!");
		}
		else if(gameStatus == Status.LOST) {
			if(chatterPicker == FIRST_CHATTER) {
				System.out.println("Oh! You're going for broke");
			}
			
			else if(chatterPicker == SECOND_CHATTER) {
				System.out.println("Aw c'mon, take a chance!");
			}	
		}
	}

	public static void displayBankBalance() {
		System.out.println("Your current balance is : " + playerBankBalance);
		System.out.println();
	}
	
	public static void displayGameStatus() {
		if(gameStatus == Status.WON) {
			System.out.println("PLAYER WIN");
		}
		else if(gameStatus == Status.LOST) {
			System.out.println("PLAYER LOSE");
		}
	}
	
	public static void continueOrExit() {
		System.out.println("Want to Continue?");
		System.out.println("1 = Continue");
		System.out.println("0 = Exit");
		continueOrExit = input.nextInt(); 
	}
}
