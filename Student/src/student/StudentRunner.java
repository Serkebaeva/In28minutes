package student;

import student.Student;

public class StudentRunner {

	
	public static void main(String[] args) {
		int[] marks = {2, 3, 5};
		Student student = new Student("Oleg", marks);		
		System.out.println("Number of marks: "+student.getNumberOfMarks());
		System.out.println("Total sum: "+student.getTotalSumOfMarks());
		student.getMaximumMark();
		student.getMinimumMark();
		System.out.println("Average Mark is: "+student.getAverageMark());;
	}

}
