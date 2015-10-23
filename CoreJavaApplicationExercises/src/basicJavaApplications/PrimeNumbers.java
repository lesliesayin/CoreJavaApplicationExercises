package basicJavaApplications;

public class PrimeNumbers {
	public static void main(String args[]) {
		int number = 12;
		int divisibilityCounter = 0;
		int divisibilityTotal = 0;
	
		for(int divisibility = 1; divisibility <= number; divisibility++) {
				int remainder = number % divisibility;

				if(remainder == 0) {
					if((divisibility != 1) && (divisibility != number)) {
						divisibilityCounter++;
					}
					if(divisibilityCounter == 1) {
						System.out.println(number + " is NON-PRIME");
						System.out.print("1 ");
					}
					if((divisibilityCounter >= 1) || (divisibility == number)) {
						System.out.print(divisibility + " ");						
					}
					divisibilityTotal = divisibilityTotal + divisibility;
				}
			}
			
		if(divisibilityCounter == 0) {
			System.out.println(number + " is PRIME");
		}
	}
}
