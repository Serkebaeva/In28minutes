package collections;

import java.util.Comparator;

class DescendingStudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}

}

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return id + ": " + name;
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(that.id, this.id);
		/*
		 * for reverse order, I would send "that.id" first.. for the ascending order,
		 * this.id first.
		 */
	}

}
