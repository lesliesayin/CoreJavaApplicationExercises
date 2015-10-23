package interactiveJavaApplications;

import java.util.Random;
import java.util.Scanner;

public class MathematicsComputerAssist {

	private static Scanner input = new Scanner(System.in);
	private static Random randomNumber = new Random();
	private static int answer;
	private	static final int ADDITION = 1;
	private	static final int SUBTRACTION = 2;
	private	static final int MULTIPLICATION = 3;
	private	static final int DIVISION = 4;
	private static int continueOption = 0;

	public static void main(String args[]) {
		final int EXIT = 0;
		final int CONTINUE = 1;
		final int NEXT_LEVEL= 2;
		
		int level = 1;
		displayGreeting();
		do {
			boolean isCorrect = true;
			int scoreCounter = 0;
			
			int menuAnswer = displayMenu();
			if(menuAnswer != EXIT) {
				displayInstruction();
				for(int counter = 1; counter <= 10; counter++) {
					int result = levelQuestion(menuAnswer, level);
					
					if(answer != result) {
						isCorrect = false;
						response(isCorrect);
					}
					else if(answer == result) {
						scoreCounter++;
						isCorrect = true;
						response(isCorrect);
					}
				}
				if(forNextLevel(scoreCounter)) {
					nextLevelMenu();
				}
				else {
					currentLevelMenu();
				}
				
				if(continueOption == NEXT_LEVEL) {
					level++;
					System.out.println("WELCOME TO LEVEL " + level);
				}
			}
		} while((continueOption == CONTINUE) || (continueOption == NEXT_LEVEL));
		
		System.out.println("Thank You!");
	}
	public static int levelQuestion(int operation, int level){
		int numberOfDigit = (int) Math.pow(10, level);
		int firstNumber = 1 + randomNumber.nextInt(numberOfDigit);
		int secondNumber = 1 + randomNumber.nextInt(numberOfDigit);
		int result = 0;

		if(operation == ADDITION) {
			System.out.print("How much is " + firstNumber + " plus " + secondNumber + " : ");
			answer = input.nextInt();
			result = firstNumber + secondNumber;
		}
		else if(operation == SUBTRACTION) {
			System.out.print("How much is " + firstNumber + " minus " + secondNumber + " : ");
			answer = input.nextInt();
			result = firstNumber - secondNumber;
		}
		else if(operation == MULTIPLICATION) {
			System.out.print("How much is " + firstNumber + " times " + secondNumber + " : ");
			answer = input.nextInt();
			result = firstNumber * secondNumber;
		}
		else if(operation == DIVISION) {
			System.out.print("How much is " + firstNumber + " divide " + secondNumber + " : ");
			answer = input.nextInt();
			result = firstNumber / secondNumber;
		}
		return result;
	}

	public static boolean forNextLevel(double answerScore) {
		double scorePercentage = ((answerScore / 10) * 100);
		boolean nextLevel = true;

		System.out.println("Your Score Percentage is : " + scorePercentage + " %");
		if(scorePercentage < 0.75) {
			System.out.println("Please ask your teacher for extra help.");
			nextLevel = false;
		}
		else {
			System.out.println("Congratulations, you are ready to go to the next level!");
			nextLevel = true;
		}
		return nextLevel;
	}

	public static void response(boolean isCorrect) {
		int respondPicker = 1 + randomNumber.nextInt(8);
		
		if(isCorrect == true) {
			respondPicker = 1 + randomNumber.nextInt(4);
			
			if(respondPicker == 1) {
					System.out.println("Very good! \n");
			}
			if(respondPicker == 2) {
				System.out.println("Excellent! \n");	
			}
			if(respondPicker == 3) {
				System.out.println("Nice work! \n");
			}
			if(respondPicker == 4) {
				System.out.println("Keep up the good work! \n");
			}
		}
		else if(isCorrect == false) {
			respondPicker = 1 + randomNumber.nextInt(4);
			if(respondPicker == 4) {
				System.out.println("No. Please try again. \n");
			}
			if(respondPicker == 3) {
				System.out.println("Wrong. Try once more. \n");
			}
			if(respondPicker == 2) {
				System.out.println("Don't give up! \n");
			}
			if(respondPicker == 1) {

				System.out.println("No. Keep trying. \n");
			}
		}
	}
	
	public static void currentLevelMenu() {
		System.out.println("Do you want to continue?");
		System.out.println("1 - Continue");
		System.out.println("0 - Exit");
		continueOption = input.nextInt();
	}
	
	public static void nextLevelMenu() {
		System.out.println("Do you want to continue?");
		System.out.println("1 - Continue This Level");
		System.out.println("2 - NextLevel");
		System.out.println("3 - Exit");
		continueOption = input.nextInt();
	}
	
	public static void displayGreeting() {
		System.out.println("\"Welcome to Mathematics Computer Assist Program\" \n");
	}
	
	public static int displayMenu() {
		System.out.println("Please choose operation");
		System.out.println("1 = ADDITION");
		System.out.println("2 = SUBTRACTION");
		System.out.println("3 = MULTIPLICATION");
		System.out.println("4 = DIVISION");
		System.out.println("0 = EXIT");
		int operation = input.nextInt();
		
		return operation;
	}

	public static void displayInstruction() {
		System.out.println("INSTRUCTION: Answer a minimum of 8 out of 10 questions correctly to proceed to the next level.\n");
	}
}






