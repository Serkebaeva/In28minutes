package sumOfNumbersInAList;

import java.util.List;

public class FPNumberRunner {
	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}

	private static int FPSum(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);
		
		System.out.println("Normal Sum: " + normalSum(numbers));
		System.out.println("FP Sum: " + FPSum(numbers));
	}

}
