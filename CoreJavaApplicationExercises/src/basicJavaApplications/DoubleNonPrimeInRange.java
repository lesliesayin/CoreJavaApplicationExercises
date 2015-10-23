package basicJavaApplications;

import java.util.Scanner;

public class DoubleNonPrimeInRange {
	private static int doubleNonPrimeLists[] = new int[getDoubleNonPrimeArraySize()];
	private static int doubleNonPrimeCounter;
	private static int startRange;
	private static int endRange;

	public static void main(String[] args) {

		promptInputRange();
		doubleNonPrimeLists = new int[getDoubleNonPrimeArraySize()];
		nonPrime(startRange, endRange);
		printMultiples();

	}

	public static int getDoubleNonPrimeArraySize() {
		int totalItems = 0;
		for (int counter = startRange; counter <= endRange; counter++) {
			totalItems++;
		}
		return totalItems;
	}

	public static void promptInputRange() {
		Scanner input = new Scanner(System.in);

		System.out.print("Input start of range : ");
		startRange = input.nextInt();
		System.out.print("Input end of range : ");
		endRange = input.nextInt();

		input.close();
	}

	public static void nonPrime(int startRange, int endRange) {
		for (int number = startRange; number <= endRange; number++) {
			int total = 0;
			boolean isNonPrime = false;

			for (int multiple = 1; multiple <= number; multiple++) {
				int remainder = number % multiple;

				if (remainder == 0) {
					total += multiple;
					if ((multiple != 1) && (multiple != number)) {
						isNonPrime = true;
					}
				}
			}
			if (isNonPrime == true) {
				doubleNonPrime(number, total);
			}
		}
	}

	public static void doubleNonPrime(int number, int multiplesTotal) {
		boolean isDoubleNonPrime = false;
		for (int multiple = 1; multiple <= multiplesTotal; multiple++) {
			int remainder = multiplesTotal % multiple;
			if ((multiple != 1) && (multiple != multiplesTotal)) {
				if (remainder == 0) {
					isDoubleNonPrime = true;
					break;
				}
			}
		}
		if (isDoubleNonPrime == true) {
			doubleNonPrimeCounter++;
			doubleNonPrimeLists[doubleNonPrimeCounter] = number;
		}
	}

	public static void printDoubleNonPrime() {

		if (doubleNonPrimeCounter != 0) {
			System.out.println("The Double Non-Prime in the given range are : ");
			for (int counter = 0; counter < doubleNonPrimeLists.length; counter++) {
				if (doubleNonPrimeLists[counter] != 0) {
					System.out.println(doubleNonPrimeLists[counter]);
				}
			}
		} else {
			System.out.println("no double non-prime");
		}
	}

	public static void printMultiples() {
		int NO_VALUE = 0;
		for (int counter = 0; counter < doubleNonPrimeLists.length; counter++) {
			int multipleTotal = 0;
			if (doubleNonPrimeLists[counter] != NO_VALUE) {
				System.out.print(doubleNonPrimeLists[counter] + " : " + " ");

				for (int multiple = 1; multiple <= doubleNonPrimeLists[counter]; multiple++) {
					int remainder = doubleNonPrimeLists[counter] % multiple;
					if (multiple == 1) {
						System.out.print("1");
					}
					if (remainder == 0) {
						multipleTotal += multiple;
						System.out.print(" + " + multiple);
					}
				}
				System.out.println(" = " + multipleTotal);
			}
		}
	}
}
