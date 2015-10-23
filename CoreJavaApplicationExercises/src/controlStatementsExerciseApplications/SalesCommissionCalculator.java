package controlStatementsExerciseApplications;

import java.util.Scanner;

public class SalesCommissionCalculator {
	
	public static final int FIRST_ITEM = 1;
	public static final int SECOND_ITEM = 2;
	public static final int THIRD_ITEM = 3;
	public static final int FOURTH_ITEM = 4;
	public static final  int fixedSalary = 200;
	public static final double firstItemValue = 239.99;
	public static final double secondItemValue = 129.75;
	public static final double thirdItemValue = 99.95;
	public static final double fourthItemValue = 350.89;
	public static double itemTotalAmount = 0;
	
	public static void main(String args[]) {
		
		salary();
	}
	
	public static void salary() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Item Numbers 1-4 or Press 0 to exit : ");
		int itemNumber = input.nextInt();

		while (itemNumber != 0) {
			if(itemNumber == FIRST_ITEM) {
			itemTotalAmount = itemTotalAmount + firstItemValue;
			
			}
			else if (itemNumber == SECOND_ITEM) {
				itemTotalAmount = itemTotalAmount + secondItemValue;
			}
			else if (itemNumber == THIRD_ITEM) {
				itemTotalAmount = itemTotalAmount + thirdItemValue;
			}
			else if (itemNumber == FOURTH_ITEM) {
				itemTotalAmount = itemTotalAmount + fourthItemValue;
			}
			else{
				System.out.println("Invalid Input");
			}
			System.out.print("Enter Item's Number or Press 0 to exit : ");
			itemNumber = input.nextInt();
		}

		double comission = (itemTotalAmount * 0.09);
		double salary = fixedSalary + comission;

		System.out.printf("Total Salary is %.2f", salary);
		
		input.close();
	}
}
