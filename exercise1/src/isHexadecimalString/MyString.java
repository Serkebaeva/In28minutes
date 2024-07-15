package isHexadecimalString;

public class MyString {

	public String str;

	public MyString(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		// case insensitivity
		return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
	}

	public boolean isHexadecimal() {
		if (str == null || str.length() == 0) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (!Character.isDigit(ch) && !isHexadecimalChar(ch)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {
		// "123F" => true "A23g" => false.
		MyString test = new MyString("123F");
		System.out.println(test.isHexadecimal());
		MyString test1 = new MyString("A23g");
		System.out.println(test1.isHexadecimal());

	}

}
