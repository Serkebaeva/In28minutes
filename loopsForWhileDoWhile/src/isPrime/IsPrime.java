package isPrime;

public class IsPrime {

	public static boolean isPrime(int n) {

		// Corner case
		if (n <= 1)
			return false;

		// Check from 2 to n-1
		for (int i = 2; i < n; i++)
			if (n % i == 0)
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(5));
		System.out.println(isPrime(7));
		System.out.println(isPrime(11));
		System.out.println(isPrime(12));
		System.out.println(isPrime(13));
		System.out.println(isPrime(19));
	}

}
