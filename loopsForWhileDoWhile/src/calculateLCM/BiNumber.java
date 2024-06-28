package calculateLCM;

public class BiNumber {

	private int number1;
	private int number2;

	public BiNumber(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public int getNumber1() {
		return number1;
	}

	public int getNumber2() {
		return number2;
	}

	public int determineMax() {

		if (number1 > number2) {
			return number1;
		} else {
			return number2;
		}
	}

	public int calculateLCM() {
		if (number1 < 0 || number2 < 0) {
			return -1;
		}

		if (number1 == 0 || number2 == 0) {
			return 1;
		}

		int max = determineMax();
		int lcm = max;
		while (true) {
			if (lcm % number1 == 0 && lcm % number2 == 0) {
				break;
			}
			lcm++;

		}
		return lcm;

	}

	public static void main(String[] args) {
		BiNumber test = new BiNumber(2, 10);
		System.out.println(test.calculateLCM());
		BiNumber test2 = new BiNumber(6, 8);
		System.out.println(test2.calculateLCM());
	}

}