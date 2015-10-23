package controlStatementsExerciseApplications;

public class SquareOfAsterisk{
	public static void main(String args[]) {
		int counterInput = 10;

		for(int counter = 0; counter < counterInput; counter++) {
			System.out.print("*");
		}
			System.out.println("");
		for(int counter = 0; counter < (counterInput - 2); counter++) {
			System.out.print("*");
			for(int spaceCounter = 0; spaceCounter < (counterInput - 2); spaceCounter++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int counter = 0; counter < counterInput; counter++) {
			System.out.print("*");
		}
	}
}
