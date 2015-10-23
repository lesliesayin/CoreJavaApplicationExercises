package enumExerciseApplications;

public class EnumSubjectsTest {
	public static void main(String[] args) {
		
		for (EnumSubjects subjects : EnumSubjects.values()) {
			printSubjectValues(subjects);
		}
	}
	
	public static void printSubjectValues(EnumSubjects subject) {
		System.out.println(subject.toString());
	}
}
