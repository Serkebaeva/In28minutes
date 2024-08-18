package keyboardTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
	Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
	Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));

	public String[] findWords(String[] words) {

		List<String> result = new ArrayList<>();

		for (String word : words) {
			String lowerCaseWord = word.toLowerCase();
			char firstChar = lowerCaseWord.charAt(0);
			Set<Character> targetRow;

			if (row1.contains(firstChar)) {
				targetRow = row1;
			} else if (row2.contains(firstChar)) {
				targetRow = row2;
			} else {
				targetRow = row3;
			}

			// Check
			boolean isValid = true;
			for (char ch : lowerCaseWord.toCharArray()) {
				if (!targetRow.contains(ch)) {
					isValid = false;
					break;
				}
			}

			if (isValid) {
				result.add(word);
			}
		}

		return result.toArray(new String[0]);

}

	public static void main(String[] args) {
		Solution solution = new Solution();
		String[] words = { "Hello", "Alaska", "Dad", "Peace", "Row", "clone", "Wet" };
		String[] result = solution.findWords(words);
		System.out.println(Arrays.toString(result));
	}
}
