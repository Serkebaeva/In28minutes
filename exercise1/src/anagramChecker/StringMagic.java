package anagramChecker;

import java.util.Arrays;

public class StringMagic {

	public boolean areAnagrams(String str1, String str2) {

		// If either str1 or str2 is null
		if (str1 == null || str2 == null) {
			return false;
		}

		if (str1 == "" && str2 == "") {
			return true;
		}

		if (str1.length() == 0 || str2.length() == 0) {
			return false;
		}

		// if the lengths of str1 and str2 are not the same.
		if (str1.length() != str2.length()) {
			return false;
		}

		// case insensitivity
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (Arrays.equals(arr1, arr2)) {
			return true;
		}

		return false;

	}
}
