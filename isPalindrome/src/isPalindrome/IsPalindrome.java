package isPalindrome;

public class IsPalindrome {

	public static boolean isPalindrome(String s) {
		// Filtering alphanumeric characters
		StringBuilder s2 = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if ((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
				s2.append(Character.toLowerCase(ch));
			}
		}

		// Reversing the filtered string using a loop
		StringBuilder s3 = new StringBuilder();
		for (int i = s2.length() - 1; i >= 0; i--) {
			s3.append(s2.charAt(i));
		}

		// Comparing 2 strings
		String filteredString = s2.toString();
		String backwardString = s3.toString();
		return filteredString.equals(backwardString);
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car")); // false
		System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
		System.out.println(isPalindrome(" ")); // true
	}

}
