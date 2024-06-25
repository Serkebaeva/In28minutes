package sumOfDigits;

public class SumOfDigits {

	public int getSumOfDigits(int number) {
		if (number < 0) {
			return -1;
		}

		if (number == 0) {
			return 0;
		}

		// 1234%10=4; 123%10=3; 12%10=2; 1%10=1
		// LOOP
		// mod 10
		// div 10

		int sumOfDigits = 0;

		while (number > 0) { // 1234
			int digit = number % 10; // 4, 3, 2, 1
			sumOfDigits += digit; // 4, 7, 9, 10
			number = number / 10; // 123, 12, 1, 0
			/*
			 * and when you divide 1 by ten, you would get a zero. So, when the number
			 * becomes zero, the loop will be terminated..
			 */

		}

		return sumOfDigits;
	}

	public static void main(String[] args) {
		SumOfDigits test = new SumOfDigits();
		System.out.println(test.getSumOfDigits(123)); // Output: 6
		System.out.println(test.getSumOfDigits(90)); // Output: 9
		System.out.println(test.getSumOfDigits(5)); // Output: 5
		System.out.println(test.getSumOfDigits(0)); // Output: 0
		System.out.println(test.getSumOfDigits(-67)); // Output: -1
	}
}