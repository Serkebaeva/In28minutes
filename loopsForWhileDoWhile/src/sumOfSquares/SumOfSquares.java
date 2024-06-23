package sumOfSquares;

public class SumOfSquares {
	public long calculateSumOfSquares(int n) {
		if (n < 0) {
			return -1;
		}

		long sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i * i;
		}

		return sum;
	}

	public static void main(String[] args) {
		SumOfSquares test = new SumOfSquares();
		System.out.println(test.calculateSumOfSquares(3));
	}

}