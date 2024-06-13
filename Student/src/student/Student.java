package student;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {
	private String name;
	private ArrayList<Integer> listOfMarks=new ArrayList<Integer>();

	public Student(String name, int... listOfMarks) {
		this.name = name;
		for (int mark: listOfMarks){
			this.listOfMarks.add(mark);
		}
	}

	public int getNumberOfMarks() {
		
		return listOfMarks.size();
	}

	public int getTotalSumOfMarks(){
		int sum = 0;		
		for(int mark: listOfMarks){
			sum = sum + mark;
		} 
		return sum;
	}

	public int getMaximumMark(){
		return Collections.max(listOfMarks);
	}

	public int getMinimumMark(){
		return Collections.min(listOfMarks);
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

	public String toString() {
		return name + listOfMarks;
	}

	public void addNewMark(int mark){
		listOfMarks.add(mark);
	}

	
	public void removeMarkAtIndex(int index){
		listOfMarks.remove(index);
	}


}
