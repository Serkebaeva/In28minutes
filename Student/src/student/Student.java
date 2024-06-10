package student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {
	private String name;
	private int[] listOfMarks;

	public Student(String name, int[] listOfMarks) {
		this.name = name;
		this.listOfMarks = listOfMarks;
	}

	public int getNumberOfMarks() {
		System.out.println(Arrays.toString(listOfMarks));
		return listOfMarks.length;
	}

	public int getTotalSumOfMarks(){
		int sum = 0;		
		for(int mark: listOfMarks){
			sum = sum + mark;
		} 
		return sum;
	}

	public int getMaximumMark(){
		int max = listOfMarks[0];
		for (int i = 1; i < listOfMarks.length; i++){
			if (listOfMarks[i]> max){
				max = listOfMarks[i];
			}
			
		} 
		System.out.println("Maximum mark of student: "+name+" is: "+max);
		return max;
	}

	public int getMinimumMark(){
		int min = listOfMarks[0];
		for (int i = 1; i < listOfMarks.length; i++){
			if (listOfMarks[i]< min){
				min = listOfMarks[i];
			}
			
		} 
		System.out.println("Minimum mark of student: "+name+" is: "+min);
		return min;
	}
/* 
	public int getAverageMark(){
		int averageMark = 0;
		for (int i=0; i<listOfMarks.length; i++){
			int sum = getTotalSumOfMarks();
			averageMark = sum/ (listOfMarks.length);
		}
		System.out.println("Average Mark of student: "+name+" is: "+averageMark);
		return averageMark;
	} */

	public BigDecimal getAverageMark(){
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number),3,RoundingMode.UP);
	}


}
