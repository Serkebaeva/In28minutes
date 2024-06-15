package secondLargestElement;

public class SecondLargestElement {

	public static int findSecondLargestElement(int[] array) {
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

		return secondLargestElement;
	}


	public static void main(String[] args) {
		int[] array = { 2, 4, 6, 9, 8, 9 };
		System.out.println(SecondLargestElement.findSecondLargestElement(array));
		System.out.println(SecondLargestElement.largestElement());

	}

}
