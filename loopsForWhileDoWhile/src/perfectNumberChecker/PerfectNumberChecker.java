package perfectNumberChecker;

public class PerfectNumberChecker {
	public void divisorsOfNumber(int n) {

		if (n <= 0) {
			System.out.print("Invalid number");
		}

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public boolean isPerfectNumber(int number) {
		if (number <= 0) {
			return false;
		}

		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}

		return sum == number;
	}

	public static void main(String[] args) {
		PerfectNumberChecker test = new PerfectNumberChecker();
		test.divisorsOfNumber(28);
		System.out.println(test.isPerfectNumber(28));
		test.divisorsOfNumber(6);
		System.out.println(test.isPerfectNumber(6));
		test.divisorsOfNumber(5);
		System.out.println(test.isPerfectNumber(5));
	}
}