package basicJavaApplications;

public class DoublePrimeNikki {
	public static int total = 12;
	
	public static void main(String[] args) {
		int input = 15;
		
		if(isDoubleNonPrime(input)) {
			System.out.println("You've got a double non prime");
		} else {
			System.out.println("Boo");
		}
		
	}

	public static boolean isDoubleNonPrime(int input) {
		boolean isDoubleNonPrime = false;
		
		if(isPrime(input)) {
			isDoubleNonPrime = false;
		} else {
			if(isPrime(total)) {
				isDoubleNonPrime = false;
			} else {
				isDoubleNonPrime = true;
			}
		}
		
		return isDoubleNonPrime;
	}
	
	public static boolean isPrime(int input) {
		boolean isPrime = true;
		total = 0;
		
		for(int counter = 1; counter <= input; counter++) {
			int remainder = input % counter;
			if(remainder == 0) {
				total += counter;
				if((counter != 1) && (counter != input)) {
					isPrime = false;
				}
			}
		}
		
		return isPrime;
	}
}
