package reversedArray;

import java.util.Arrays;

public class ShorterCaseReversedArray {

	public static int[] reverseArray(int[] array) {
		if (array.length == 0 || array.length == 1) {
			return array;
		}

		int[] reversedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}

		return reversedArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(ArrayMagic.reverseArray(array1)));
	}

}
