package stringMagicLongestWord;

public class StringMagic {

	public static String findLongestWord(String sentence) {
		String[] words = sentence.split(" ");
		String longestWord = "";
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > longestWord.length()) {
				longestWord = words[i];
			}
		}
		return longestWord;
	}

	public static void main(String[] args) {
		System.out.println(findLongestWord("blahh blahhhhaaa bla"));
	}
}