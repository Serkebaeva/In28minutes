package returnArrayListwithMultiplesOfaNumLessThanSpecifiedLimit;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

	public static List<Integer> determineMultiples(int number, int limit) {
		List<Integer> multiples = new ArrayList<>();

		if (number <= 0 || limit <= 0) {
			return multiples;
		}

		for (int i = 1; i < limit; i++) {
			int temp = number * i;
			if (temp < limit) {
				multiples.add(temp);
			} else {
				break; // Exit the loop when temp exceeds the limit
			}
		}

		return multiples;
	}

	public static void main(String[] args) {
		List<Integer> result = determineMultiples(3, 20);
		System.out.println(result);
	}
}

