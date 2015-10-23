package basicJavaApplications;

public class PerfectNumber {

	public static void main(String args[]) {
		int input = 6;

		if(isPerfect(input)) {
			System.out.println(input + " is a perfect number");
		}
		else {
			System.out.println(input + " is not a perfect number");
		}
	}

	public static boolean isPerfect(int input) {
		int total = 1;

		for(int factor = 1; factor < input; factor++) {
			int remainder = input % factor;
			
			if(factor == 1) {
				System.out.print(factor);
			}
			
			if((remainder == 0) && (factor != 1)) {
				System.out.print(" + " + factor);
				total += factor;
			}
		}
		System.out.println(" = " + total);

		if(total == input) {
			return true;
		}
		else {
			return false;
		}
	}
}