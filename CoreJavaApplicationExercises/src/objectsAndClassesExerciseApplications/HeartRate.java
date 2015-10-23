package objectsAndClassesExerciseApplications;

public class HeartRate {
	String firstName;
	String lastName;
	int month;
	int day;
	int year;
	double endRange;

	public HeartRate(String firstName, String lastName, int month, int day, int year) {
		this.firstName = firstName;
		this.lastName = lastName;

		if((month >= 1) && (month <= 12)) {
			this.month = month;
		}
		if((day >= 1) && (day <= 32)) {
			this.day = day;
		}
		if(year >= 1) {
			this.year = year;
		}
	}

	public void setFirstName(String firstName) {
		firstName = this.firstName;
	}

	public String getFirstName(String firstName) {
		return firstName;
	}

	public void setLastName(String lastName) {
		lastName = this.lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setMonth(int month) {
		if((month >= 1) && (month <= 12)) {
			month = this.month;
		}
	}

	public int getMonth(){
		return month;
	}

	public void setDay(int day) {
		day = this.day;
	}

	public int getDay(){
		return day;
	}

	public void setYear(int year) {
		year = this.year;
	}

	public int getYear(){
		return year;
	}

	public int age() {
		int currentYear = 2015;

		int age = currentYear - year;

		return age;
	}

	public int maximumHeartRate() {
		int maximumHeartRate = (220 - age());

		return maximumHeartRate;
	}
	
	public void getRange() {
	
		double startRange = (0.50 * maximumHeartRate());
		double endRange = (0.85 * maximumHeartRate());
		
		System.out.printf("Target Heart Rate Range is %.2f - %.2f", startRange, endRange);
	}
	
	public void printName() {
		System.out.println(firstName + " " + lastName);
	}

	public void printBirthDate() {
		System.out.println(month + "/" + day + "/" + year);
	}
}
	

