package rightMostDigitInAString;

public class StringMagic {

	public int getRightMostDigit(String str) {
		if (str == null || str.equals("")) {
			return -1;
		}

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}

		return -1; // if no digit found...
	}

	public static void main(String[] args) {
		StringMagic str = new StringMagic();
		System.out.println(str.getRightMostDigit("Apples 2, 3 bananas, 6 onions and kiwi"));
	}
}
