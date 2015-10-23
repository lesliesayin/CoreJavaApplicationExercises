package enumExerciseApplications;

public enum EnumSubjects {
	FILIPINO("Filipino","Reyes", 2, "7:30-9:30"),
	ENGLISH ("English", "Ares", 3.5, "7:30-9:30"),
	MATH ("Mathematics", "Costales", 4, "7:30-9:30"),
	SCIENCE ("Science and Technology", "Cooper", 4, "7:30-9:30"),
	HISTORY ("History", "Alforte", 2, "7:30-9:30"),
	LOGIC ("Principles of Logic", "Gutierrez", 3.5, "7:30-9:30"),
	POLSCI ("Political Science", "Placido", 2.5, "7:30-9:30");
	
	private String title;
	private String teacher;
	private double units;
	private String time;
	
	EnumSubjects(String title, String teacher, double units, String time) {
		this.title = title;
		this.teacher = teacher;
		this.units = units;
		this.time = time; 
	}

	public String getTitle() {
		return title;
	}
	public String getTeacher() {
		return teacher;
	}
	public double getUnits() {
		return units;
	}
	public String getTime() {
		return time;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		StringBuilder value = new StringBuilder();
		value.append("++++++++++++++++++++++");
		value.append("\n");
		value.append(title);
		value.append("\n");
		value.append(teacher);
		value.append("\n");
		value.append(units);
		value.append("\n");
		value.append(time);
		value.append("\n");
		return value.toString();
	}
}