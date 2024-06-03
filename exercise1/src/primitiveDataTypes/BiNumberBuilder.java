package primitiveDataTypes;

import primitiveDataTypes.primitiveDataTypes.BiNumber;

public class BiNumberBuilder {

	public static void main(String[] args) {
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println("Number 1: " + numbers.getNumber1());
		System.out.println("Number 2: " + numbers.getNumber2());

		numbers.addNumbers(3, 2);
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());

		numbers.doubleNumbers();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
	}

}
