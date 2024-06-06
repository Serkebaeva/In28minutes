package sumOfNumUpToN;

public class SumOfNumUpToN {

	/* well known formula by Gauss x= n(n+1)/2; */

	static int sumUpToN(int n) {
		int i;
		i = (n * (n + 1)) / 2;
		return i;
	}

	public static void main(String[] args) {
		System.out.println(sumUpToN(10));
	}

}
