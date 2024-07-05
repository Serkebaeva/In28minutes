package findTheDifference;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static char findTheDifference(String s, String t) {
		if (s.equals(t)) {
			System.out.println("Strings are identical");
		}

		List<Character> diff = new ArrayList<>();
		char[] tArray = t.toCharArray();
		char[] sArray = s.toCharArray();

		for (int i = 0; i < tArray.length; i++) {
			diff.add(tArray[i]);
		}

		for (int i = 0; i < sArray.length; i++) {
			diff.remove(Character.valueOf(sArray[i]));
		}

		return diff.get(0);

	}

	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}
	}
