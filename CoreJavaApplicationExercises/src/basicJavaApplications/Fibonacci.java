package basicJavaApplications;

public class Fibonacci {
	public static void main(String args[]) {

		int first = 0;
		int second = 1;
		
		for(int counter = 1; counter < 10; counter++) {
			if(counter == 1) {
				System.out.print(first + " " + second + " ");
			}
			else {
				int total = first + second;
				first = second;
				second = total;

				System.out.print(second + " ");
			}
		}
	}
}
