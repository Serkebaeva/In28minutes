package sumOfNumUpToN;

public class SumUpToN {

	public static void main(String[] args) {
		System.out.println(sumUpToN(6));
	}

	public static int sumUpToN(int n) {
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println(sum);
		}

		return sum;
	}

}
