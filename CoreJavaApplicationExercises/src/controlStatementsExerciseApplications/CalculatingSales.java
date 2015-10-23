package controlStatementsExerciseApplications;

import java.util.Scanner;

public class CalculatingSales {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double totalAmount = 0;
		double firstProductPrice = 2.98;
		double secondProductPrice = 4.50;
		double thirdProductPrice = 9.98;
		double fourthProductPrice = 4.49;
		double fifthProductPrice = 6.87;

		System.out.print("Enter Product Number From 1 - 5 or press 0 to exit : ");
		int productNumber = input.nextInt();
		int quantity = 0;
		if((productNumber >= 1) && (productNumber <= 5)) {
			System.out.print("Enter Product Quantity : ");
			quantity = input.nextInt();	
		}

		while(productNumber != 0) {
			if(((productNumber >= 1) && (productNumber <= 5)) && (quantity > 0)) {
				double netPrice = 0;
				switch(productNumber) {
					case 1 : 
						netPrice = firstProductPrice * quantity;
						totalAmount = totalAmount + netPrice;
						break;
					case 2 : 
						netPrice = secondProductPrice * quantity;
						totalAmount = totalAmount + netPrice;
						break;
					case 3 : 
						netPrice = thirdProductPrice * quantity;
						totalAmount = totalAmount + netPrice;
						break;
					case 4 : 
						netPrice = fourthProductPrice * quantity;
						totalAmount = totalAmount + netPrice;
						break;
					case 5 : 
						netPrice = fifthProductPrice * quantity;
						totalAmount = totalAmount + netPrice;
						break;
				}
				System.out.print("Enter Product Number From 1 - 5 or press 0 to exit : ");
				productNumber = input.nextInt();
				if((productNumber >= 1) && (productNumber <= 5)) {
					System.out.print("Enter Product Quantity : ");
					quantity = input.nextInt();	
				}
			}
			else {
					System.out.println("Invalid Input");
					System.out.print("Enter Product Number From 1 - 5 or press 0 to exit : ");
					productNumber = input.nextInt();
					if((productNumber >= 1) && (productNumber <= 5)) {
						System.out.print("Enter Product Quantity : ");
						quantity = input.nextInt();	
					}
			}
		}
		System.out.printf("Total Amount is " + totalAmount);
		
		input.close();
	}
}

