package reverseANumber;

public class NumberUtils {

	/**
	 * This method reverses a given integer and returns the reversed number. If the
	 * number is negative, it returns -1 as the reverse of a negative number is
	 * undefined. If the number is zero, it returns 0 as the reverse of 0 is 0.
	 * 
	 * @param number: an integer
	 * @return reversed number, or -1 if number is negative, or 0 if number is zero.
	 */
	public int reverseNumber(int number) {
		if (number == 0) {
			return 0;
		}

		if (number < 0) {
			return -1;
		}

		int reverse = 0;
		while (number > 0) {
			int digit = number % 10;
			number = number / 10;
			reverse = reverse * 10 + digit;
			System.out.printf("digit - %d number - %d reverseNumber - %d", digit, number, reverse).println();
		}

		return reverse;

	}

	public static void main(String[] args) {
		NumberUtils test = new NumberUtils();
		System.out.println(test.reverseNumber(123));
		System.out.println(test.reverseNumber(5497));
		System.out.println(test.reverseNumber(8423));
	}
}
