package primitiveDataTypes;

public class primitiveDataTypes {

	public static class BiNumber {

		private int number1;
		private int number2;

		public BiNumber(int number1, int number2) {
			this.number1 = number1;
			this.number2 = number2;
		}

		public int getNumber1() {
			return this.number1;
		}

		public int getNumber2() {
			return this.number2;
		}

		public void addNumbers(int int1, int int2) {
			this.number1 = this.number1 + int1;
			this.number2 = this.number2 + int2;
		}

		public void multiply() {
			int multiplyedSum = this.number1 * this.number2;
			System.out.println(multiplyedSum);
		}

		public void doubleNumbers() {
			this.number1 *= 2;
			this.number2 *= 2;
		}

	}
}
