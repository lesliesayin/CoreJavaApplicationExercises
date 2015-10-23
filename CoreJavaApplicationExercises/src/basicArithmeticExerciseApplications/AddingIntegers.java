package basicArithmeticExerciseApplications;

import java.util.Scanner;

public class AddingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstNumber = 0;
		int secondNumber = 0;
		int sum;

		System.out.print("Enter First Number: ");
		firstNumber = input.nextInt();
		System.out.print("Enter Second Number: ");
		secondNumber = input.nextInt();

		sum = firstNumber + secondNumber;

		System.out.printf("The total is %d", sum);
		
		input.close();
	}
}
