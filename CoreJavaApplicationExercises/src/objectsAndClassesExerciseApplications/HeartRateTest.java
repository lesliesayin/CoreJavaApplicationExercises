package objectsAndClassesExerciseApplications;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HeartRate healthRecord_1 = new HeartRate("Nikki Nicholas", "Romero", 8, 05, 1991);

		healthRecord_1.printName();
		healthRecord_1.printBirthDate();
		System.out.println("Age : " + healthRecord_1.age());
		System.out.println("Maximum Heart Rate : " + healthRecord_1.maximumHeartRate());
		healthRecord_1.getRange();
		
		input.close();
	}
}

