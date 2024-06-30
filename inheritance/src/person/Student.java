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
		// Call the toString method of the superclass (Person)
		String personDetails = super.toString();
		// Append the details specific to the Student class
		String studentDetails = String.format(", college Name: %s, year of study: %s", collegeName, year);
		return personDetails + studentDetails;
	}

	// !!!Person here called a SUPER class, and Student a SUBCLASS

}
