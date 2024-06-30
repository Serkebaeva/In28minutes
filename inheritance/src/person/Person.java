package person;

public class Person {
	private String name;
	private String email;
	private String phoneNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	// print
	public String toString() {
		return String.format("name: %s, email: %s, phone Number: %s", name, email, phoneNumber);
	}

}


