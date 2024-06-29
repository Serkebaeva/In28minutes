package customer;

public class Customer {
	// state
	private String name;
	private Address homeAddress;
	private Address workAddress;
	/*
	 * the address is smth which can be an object on its own or class on its own..
	 * So, now we are doing here Object Composition (because Customer has an address
	 * and we will represent the address as another class...)
	 */

	// creating
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.homeAddress = homeAddress;

	}

	// operations

	public Address getHomeAddress() {
		return homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	// print
	public String toString() {
		return String.format("name - [%s], homeAddress - [%s], workAddress - [%s]", name, homeAddress, workAddress);
	}

}
