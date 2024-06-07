package sumOfDivisors;

public class SumOfDivisors {

	public static int SumOfDivisors(int n) {
		int sum = 0;
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(SumOfDivisors(9));
	}

}
