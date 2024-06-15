package arrayMagic;

public class ArrayMagic {

	/**
	 * This method determines whether there's an element greater than a given number
	 * in an array.
	 *
	 * @param array  The array to search through.
	 * @param number The number to compare with the array elements.
	 * @return True if there's an element greater than the given number in the
	 *         array, false otherwise.
	 */
	public static boolean doesHaveElementGreaterThan(int[] array, int number) {

		for (int element : array) {
			if (element > number) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		int number = 3;

		System.out.print(ArrayMagic.doesHaveElementGreaterThan(array, number));
	}
}
