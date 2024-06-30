package person;

public class Student extends Person {
	private String collegeName;
	private int year; // YearOfStudy

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// print
	public String toString() {
		return String.format("college Name: %s, year of study: %s", collegeName, year);
	}

	// !!!Person here called a SUPER class, and Student a SUBCLASS

}
