package repeatedSubstringPattern;

class Solution {
	public boolean repeatedSubstringPattern(String s) {
		int[] counter = new int[26];
		int substrStart = -1;
		int substrEnd = -1;

		for (char ch : s.toLowerCase().toCharArray()) {
			if (ch == 'a' || ch == 'z') {
				counter[ch - 'a']++;

				if (counter[ch - 'a'] == 1) {
					substrStart = s.indexOf(ch);
				} else if (counter[ch - 'a'] == 2) {
					substrEnd = s.indexOf(ch, substrStart + 1); // Find second occurrence

					// Extract the substring between substrStart and substrEnd
					String substring = s.substring(substrStart, substrEnd + 1);
					System.out.println(substring);

					// Reset the start and end for the next substring search
					substrStart = -1;
					substrEnd = -1;

					String[] strArray = s.split(substring);
					int substrCounter = 0;
					for (String sbStr : strArray) {
						if (!sbStr.isEmpty()) { // Check if substring is repeated
							substrCounter++;
						}
						if (substrCounter >= 1) {
							return true;
						}

					}
				}

			}

		}
		return false;

	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.repeatedSubstringPattern("abcabcabcabc"));
		System.out.println(solution.repeatedSubstringPattern("abab"));
		System.out.println(solution.repeatedSubstringPattern("aba"));
	}
}

