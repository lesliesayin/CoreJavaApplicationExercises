package controlStatementsExerciseApplications;

import java.util.Scanner;

public class ComparingIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int firstInteger;
		int secondInteger;

		System.out.print("Enter First Number: ");
		firstInteger = input.nextInt();
		System.out.print("Enter Second Number: ");
		secondInteger = input.nextInt();

		if(firstInteger > secondInteger){
			System.out.println(firstInteger + " is greater than" + secondInteger);
		}
		if(firstInteger < secondInteger){
			System.out.println(firstInteger + " is greater than" + secondInteger);
		}
		
		input.close();
	}
}
