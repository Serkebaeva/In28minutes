package returnArrayListwithMultiplesOfaNumLessThanSpecifiedLimit;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic2 {
	/**
	 * This method generates a list of multiples of a given number less than a
	 * specified limit.
	 * 
	 * @param number the number to find multiples of
	 * @param limit  the upper bound for the multiples
	 * @return a List of multiples of the number less than the limit
	 */
	public static List<Integer> determineMultiples(int number, int limit) {
		/// 10

		List<Integer> multiples = new ArrayList<>();

		if (number <= 0 || limit <= 0) {
			return multiples;
		}

		for (int i = number; i < limit; i++) {
			if (number % i == 0 && number < limit || i % number == 0 && number < limit) {
				multiples.add(i);
			}
		}

		return multiples;

	}

	public static void main(String[] args) {
		List<Integer> result = determineMultiples(3, 20);
		System.out.println(result);
	}

}

