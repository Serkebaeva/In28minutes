package reverseVowelsOfString;

class Solution {
	public String reverseVowels(String s) {
		char[] vowelsArray = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		StringBuilder sb = new StringBuilder();
		char[] charArr = s.toCharArray(); // The character array of the input string
		int vowelPointer = charArr.length - 1; // Start looking for vowels from the end

		for (int i = 0; i < charArr.length; i++) {
			if (isVowel(charArr[i], vowelsArray)) { // If the current char is a vowel
				while (vowelPointer >= 0 && !isVowel(charArr[vowelPointer], vowelsArray)) {
					vowelPointer--; // Find the next vowel from the end
				}
				if (vowelPointer >= 0) {
					sb.append(charArr[vowelPointer]); // Append the vowel found from the end
					vowelPointer--; // Move the pointer left
				}
			} else {
				sb.append(charArr[i]); // Append the non-vowel character as is
			}
		}

		return sb.toString(); // Return the modified string
	}

	// Helper function to check if a character is a vowel
	private boolean isVowel(char c, char[] vowelsArray) {
		for (char v : vowelsArray) {
			if (c == v) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.reverseVowels("IceCreAm")); // Should output: "AceCreIm"
		System.out.println(solution.reverseVowels("leetcode")); // Should output: "leotcede"
	}
}
