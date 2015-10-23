package objectsAndClassesExerciseApplications;

public class BankAccount {
	private String accountName;
	private double balance;

	public BankAccount(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountName() {
		return accountName;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount >= 0) {
			balance = balance + amount;
		} else {
			System.out.println("Could not deposit negative or zero amount");
		}
	}

	public void withdraw(double amount) {
		if ((balance >= amount) && (amount > 0)) {
			balance = balance - amount;
		} else {
			System.out.println("Could not withdraw negative, zero, and amount that exceeds your current balance");
		}
	}
}
