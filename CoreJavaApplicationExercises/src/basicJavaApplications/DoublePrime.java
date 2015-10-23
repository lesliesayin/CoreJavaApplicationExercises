package basicJavaApplications;

public class DoublePrime {
	public static void main(String args[]) {
		int number = 8;
		int divisibilityCounter = 0;
		int processCount = 1;
		int divisibilityTotal = 0;

		do {
			for(int divisibility = 1; divisibility <= number; divisibility++) {
				int remainder = number % divisibility;

				if(remainder == 0) {
					if((divisibility != 1) && (divisibility != number)) {
						divisibilityCounter++;
					}
					
					if(divisibilityCounter == 1) {
						System.out.println(number + " is NON-PRIME");
						System.out.print(number + " is divisible by 1 ");
					} 
					if((divisibilityCounter >= 1)) {
						System.out.print(divisibility + " ");						
					}
					
					divisibilityTotal = divisibilityTotal + divisibility;
				}
			}

			processCount++;
			if((processCount == 2) && (divisibilityCounter >= 1)){
				System.out.println("");
				System.out.println("The total of all divisibility number of " + number + " is " + divisibilityTotal);
				divisibilityCounter = 0;
				number = divisibilityTotal;
			}
		} while((processCount == 2) && (divisibilityCounter == 0));

		if(divisibilityCounter >= 1) {
			System.out.println("");
			System.out.println("Therefore we get DOUBLE NON-PRIME :)");
		} else if(divisibilityCounter == 0) {
			System.out.println(number + " is PRIME");
		}
	}
}
