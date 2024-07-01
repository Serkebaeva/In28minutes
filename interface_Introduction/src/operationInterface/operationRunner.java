package operationInterface;

public class operationRunner {

	public static void main(String[] args) {
		Operation[] test = { new Add(), new Subtract(), new Divide() };
		for (Operation element : test) {
			System.out.println(element.perform(20, 10));
		}
	}

}
