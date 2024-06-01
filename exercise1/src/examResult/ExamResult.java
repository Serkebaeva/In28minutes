package examResult;

public class ExamResult {

	public boolean isPass(int marks) {

		// Update Code : If the student's marks are greater than 50, they have passed
		// the exam.
		/*
		 * if (marks > 50) { System.out.println("Congratulations, you have passed!");
		 * return true; } else {
		 * System.out.println("Unfortunately, you have not passed!"); return false; }
		 */
		
		// I could make it even more shorter with:
		return marks > 50;
	}

	public static void main(String[] args) {
		ExamResult student1 = new ExamResult();
		System.out.println(student1.isPass(65));
		student1.isPass(40);
		student1.isPass(51);
	
	}
}

