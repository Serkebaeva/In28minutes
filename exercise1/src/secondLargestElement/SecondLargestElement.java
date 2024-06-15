package secondLargestElement;

public class SecondLargestElement {

	public static int findSecondLargestElement(int[] array) {
		if (array.length < 2) {
			return -1; // Return -1 if the array has less than 2 elements.
		}

		int largestNumber = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;

		for (int number : array) {
			if (number > largestNumber) {
				secondLargestElement = largestNumber;
				largestNumber = number;
			} else if (number > secondLargestElement && number != largestNumber) {
				secondLargestElement = number;
			}
		}

		// If there is no second largest element (all elements in the array are the
		// same), return -1
		if (secondLargestElement == Integer.MIN_VALUE) {
			return -1;
		}

		return secondLargestElement;
	}


	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 9, 8, 9 };
		System.out.println(SecondLargestElement.findSecondLargestElement(array));
		int[] array2 = { 2, 2, 2 };
		System.out.println(SecondLargestElement.findSecondLargestElement(array2));

	}

}
