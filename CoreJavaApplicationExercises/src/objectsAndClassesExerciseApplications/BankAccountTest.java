package objectsAndClassesExerciseApplications;

import java.util.Scanner;

public class BankAccountTest {
	public static final int INQUIRE = 1;
	public static final int DEPOSIT = 2;
	public static final int WITHDRAW = 3;
	public static final int EXIT = 4;
	public static final int YES = 1;
	public static final int NO = 2;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BankAccount account = new BankAccount("Nikki");

		System.out.println("Welcome " + account.getAccountName());

		do {
			int transaction = getTransactionChoice();
			if (transaction == INQUIRE) {
				System.out.println("Your current balance is : " + account.getBalance());
			} else if (transaction == DEPOSIT) {
				System.out.print("Enter amount to deposit: ");
				double amount = input.nextDouble();
				account.deposit(amount);
				System.out.println("Your new balance is " + account.getBalance());
			} else if (transaction == WITHDRAW) {
				System.out.print("Enter amount to withdraw : ");
				double amount = input.nextDouble();
				account.withdraw(amount);
				System.out.println("Your new balance is " + account.getBalance());
			} else if (transaction == EXIT) {
				break;
			} else {
				displayInvalidInput();
			}

			int continueOrExit = continueOrExit();
			if (continueOrExit == YES) {
				continue;
			} else if (continueOrExit == NO) {
				break;
			} else {
				displayInvalidInput();
			}
		} while (true);

		System.out.println("Thank You");
		input.close();
	}

	public static void displayInvalidInput() {
		System.out.println("Invalid Input");
	}

	public static int getTransactionChoice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose Transaction");
		System.out.println("1 = Inquire Balance");
		System.out.println("2 = Deposit");
		System.out.println("3 = Withdraw");
		System.out.println("4 = Exit");
		return input.nextInt();
	}

	public static int continueOrExit() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want another transaction?");
		System.out.println("1 = Yes");
		System.out.println("2 = No");
		return input.nextInt();
	}
	

}


