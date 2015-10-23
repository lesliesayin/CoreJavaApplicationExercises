package basicArithmeticExerciseApplications;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int firstInteger;
		int secondInteger;
		int sum;
		int difference;
		int product;
		int quotient;

		System.out.print("Enter First Integer : ");
		firstInteger = input.nextInt();
		System.out.print("Enter Second Integer : ");
		secondInteger = input.nextInt();

		sum = firstInteger + secondInteger;
		difference = firstInteger - secondInteger;
		product = firstInteger * secondInteger;
		quotient = firstInteger / secondInteger;

		System.out.println();

		System.out.println("The sum is " + sum);
		System.out.println("The difference is " + difference);
		System.out.println("The product is " + product);
		System.out.println("The quotient is " + quotient);
		
		input.close();
	}
}
