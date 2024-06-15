package areSumsOfArraysEqual;

public class BiArray {

	private int[] array1;
	private int[] array2;

	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		// TODO: Write the code to compare the sums of the arrays and return the result.

		return sum1 == sum2;
	}

	private int calculateSum(int[] array) {

		// TODO: Write the code to calculate the sum of the array.
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		return sum;

	}

	public static void main(String[] args) {

		BiArray example1 = new BiArray(new int[] { 1, 2 }, new int[] { 4, -2, 1 });
		System.out.println(example1.areSumsEqual());

		BiArray example2 = new BiArray(new int[] { 5, 10, 15 }, new int[] { 1, 9, 20 });
		System.out.println(example2.areSumsEqual());

		BiArray example3 = new BiArray(new int[] { -1, -1, -1 }, new int[] { -2, 1 });
		System.out.println(example3.areSumsEqual());
	}
}
