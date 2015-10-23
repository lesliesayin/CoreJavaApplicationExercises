package basicArithmeticExerciseApplications;

import java.util.Scanner;
	
public class ProductCalculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int result;

		System.out.print("Enter First Integer: ");
		x = input.nextInt();
		System.out.print("Enter Second Integer: ");
		y = input.nextInt();
		System.out.print("Enter Third Integer: ");
		z = input.nextInt();
		
		result = ((x * y) * z);
		
		System.out.println("The Product is " + result); 
		
		input.close();
	}
}

