package person;

public class StudentRunner {
public static void main(String[] args) {
	/*
	 * Student student = new Student(); student.setName("Aiza");
	 * student.setEmail("aghdfagf@gmail.com"); System.out.println(student);
	 */

	Employee employee = new Employee("Aiza", "Programmer");
	employee.setPhoneNumber("1213-837-2837");
	employee.setEmployeeGrade('A');
	System.out.println(employee);
}
}
