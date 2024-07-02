package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Aiza"));
		System.out.println(students);

		List<Student> studentsAL = new ArrayList<>(students);

		Collections.sort(studentsAL);
		System.out.println(studentsAL);
	}

}
