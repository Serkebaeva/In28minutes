package reversArray_In_Place;

import java.util.Arrays;

public class Solution {
	public void reverseString(char[] s) {
		int start = 0; // Start pointer
		int end = s.length - 1; // End pointer

		while (start < end) {
			// Swap the characters
			char temp = s[start];
			s[start] = s[end];
			s[end] = temp;

			// Move the pointers towards the center
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		Solution rs = new Solution();
		char[] s1 = { 'h', 'e', 'l', 'l', 'o' };
		char[] s2 = { 'H', 'a', 'n', 'n', 'a', 'h' };

		rs.reverseString(s1);
		rs.reverseString(s2);

		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
	}
}

