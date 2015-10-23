package basicJavaApplications;

import java.util.Scanner;

public class Multiples {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Second Number : ");
		int firstNumber = input.nextInt();
		System.out.print("Enter Second Number : ");
		int secondNumber = input.nextInt();

		if (isMultiple(firstNumber, secondNumber)) {
			System.out.println(secondNumber + " is a multiple of " + firstNumber);
		} else {
			System.out.println(secondNumber + " is not a multiple of " + firstNumber);
		}

		input.close();
	}

	public static boolean isMultiple(int firstNumber, int secondNumber) {
		int result = firstNumber % secondNumber;

		if (result == 0) {
			return true;
		} else {
			return false;
		}
	}
}
