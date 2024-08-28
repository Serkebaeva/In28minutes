package palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		String num = String.valueOf(x);
		StringBuilder backwardNum = new StringBuilder();

		for (int i = num.length() - 1; i >= 0; i--) {
			backwardNum.append(num.charAt(i));
		}

		String num2 = backwardNum.toString();

		return num.equals(num2);
	}

	public static void main(String[] args) {
		Solution str = new Solution();
		System.out.println(str.isPalindrome(123));
		System.out.println(str.isPalindrome(121));
		System.out.println(str.isPalindrome(-121));
	}
}