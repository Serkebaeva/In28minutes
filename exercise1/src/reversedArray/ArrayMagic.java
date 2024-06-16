package reversedArray;

import java.util.Arrays;

public class ArrayMagic {
	public static int[] reverseArray(int[] array) {
		if (array.length == 0) {
			return new int[0];
		}

		if (array.length == 1) {
			return array;
		}

		int[] reversedArray = new int[array.length];
		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			reversedArray[start] = array[end];
			reversedArray[end] = array[start];
			start++;
			end--;
		}

		return reversedArray;
	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4 };
		int[] array2 = { 5, -10, 15, -20 };
		int[] array3 = { 100, 200, 300, 400, 500 };
		System.out.println(Arrays.toString(ArrayMagic.reverseArray(array1)));
		System.out.println(Arrays.toString(ArrayMagic.reverseArray(array2)));
		System.out.println(Arrays.toString(ArrayMagic.reverseArray(array3)));
	}
}
