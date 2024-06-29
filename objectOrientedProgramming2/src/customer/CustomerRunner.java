package customer;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Warsaw", "07-432");
		Customer customer = new Customer("Aiza", homeAddress);
		System.out.println(customer);

		Address workAddress = new Address("line 2", "Warsaw", "07-400");
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
