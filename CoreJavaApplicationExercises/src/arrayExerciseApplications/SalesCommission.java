package arrayExerciseApplications;

import java.util.Scanner;

public class SalesCommission {
	private static int sales[];
	private static double salaries[];
	private static Scanner input = new Scanner(System.in);
	private static int salesPeople;
	
	public static void main(String args[]) {
		inputSales();
		salary();
		displaySalaryChart();
	}

	public static void inputSales() {
		System.out.print("Enter total sales to input : \n");
		salesPeople = input.nextInt();
		sales = new int[salesPeople];

		System.out.println("Enter " + salesPeople + " sales : ");
		for(int counter = 0; counter < salesPeople; counter++) {
			System.out.print("Employee " + (counter + 1) + " : ");
			sales[counter] = input.nextInt();
		}
	}

	public static void salary() {
		final double fixedSalary = 200;
		salaries = new double[salesPeople];	
		for(int counter = 0; counter < sales.length; counter++) {
			double commission = (sales[counter] * 0.09);
			salaries[counter] = commission + fixedSalary;
		}
	}

	public static void displaySalaryChart() {
		System.out.println("\nSalary Distribution");
		int frequency[] = new int[10];

		for(double salary : salaries) {
			++frequency[(int) (salary / 200)];
		}

		for(int count = 0; count < frequency.length; count++) {
			if(count == 1000) {
				System.out.printf("%5d : ", 1000);
			}
			else {
				System.out.printf("%02d-%02d : ", count * 100, count * 100 + 99);
				for(int stars = 0; stars < frequency[count]; stars++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
	}
}
