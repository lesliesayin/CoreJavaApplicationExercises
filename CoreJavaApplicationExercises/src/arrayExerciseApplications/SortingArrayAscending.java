package arrayExerciseApplications;

import java.util.Scanner;

public class SortingArrayAscending {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter total items to input : ");
		int inputSize = input.nextInt();

		System.out.println("Enter " + inputSize + " number");
		int numberInput[] = new int[inputSize];

		for (int i = 0; i < numberInput.length; i++) {
			numberInput[i] = input.nextInt();
		}

		for (int counter = 1; counter < inputSize; counter++) {
			for (int inner = counter; inner > 0; inner--) {
				if (numberInput[inner] < numberInput[inner - 1]) {
					int lower = numberInput[inner];
					numberInput[inner] = numberInput[inner - 1];
					numberInput[inner - 1] = lower;
				}
			}
		}

		System.out.println("Input in Ascending Order");
		for (int number : numberInput) {
			System.out.print(number + " ");
		}
		
		input.close();
	}
}
