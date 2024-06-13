package student;

import student.Student;

public class StudentRunner {

	
	public static void main(String[] args) {
		Student student = new Student("Oleg", 2, 3, 5);		
		System.out.println("Number of marks: "+student.getNumberOfMarks());
		System.out.println("Total sum: "+student.getTotalSumOfMarks());
		student.getMaximumMark();
		student.getMinimumMark();
		System.out.println("Average Mark is: "+student.getAverageMark());
		System.out.println(student);
		student.addNewMark(35);
		System.out.println(student);
		student.removeMarkAtIndex(1);
		System.out.println(student);
	}

}
