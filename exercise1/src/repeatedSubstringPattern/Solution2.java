package repeatedSubstringPattern;

public class Solution2 {
	public boolean repeatedSubstringPattern(String s) {
		int n = s.length();
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				String substring = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < n / i; j++) {
					sb.append(substring);
					System.out.println(substring);
				}
				if (sb.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		System.out.println(solution.repeatedSubstringPattern("abab")); // true
		System.out.println(solution.repeatedSubstringPattern("aba")); // false
	}
}
