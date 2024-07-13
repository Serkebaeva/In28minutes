package occurancesOfCharAndWordsInA_String;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " + "This has never happened before. " + "awesome";
		// Map Interface - Exercise - Count occurrences of characters and words in
		// HashMap

		Map<Character, Integer> occurrences = new HashMap<>();

		char[] characters = str.toCharArray();
		for (char character : characters) {
			// Get the Char
			Integer integer = occurrences.get(character);

			if (integer == null) {
				occurrences.put(character, 1);
			} else {
				occurrences.put(character, integer + 1);
			}


		}

		System.out.println(occurrences);

		// ======================================================================

		Map<String, Integer> StringOccurrences = new HashMap<>();

		String[] words = str.split(" ");
		for (String word : words) {
			// Get the word
			Integer integer = StringOccurrences.get(word);

			if (integer == null) {
				StringOccurrences.put(word, 1);
			} else {
				StringOccurrences.put(word, integer + 1);
			}

		}

		System.out.println(StringOccurrences);

	}

}
