package enumExerciseApplications;

public enum EnumApplicationStatus {

	PASSED("Your application is succeful", "Congrats"), 
	PENDING("Your application is pending", "Please wait"), 
	FAILED("Your application is failed", "Please try again");

	private String status;
	private String notes;

	EnumApplicationStatus(String status, String notes) {
			this.status = status;
			this.notes = notes;
	}

	public String getStatus() {
		return status;
	}

	public String getNotes() {
		return notes;
	}
}
