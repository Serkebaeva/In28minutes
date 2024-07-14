package findTheIndexOfFirstOccurrenceInTheString;

class Solution {
	public int strStr(String haystack, String needle) {
		char[] arr1 = haystack.toCharArray();
		char[] arr2 = needle.toCharArray();

		for (int i = 0; i <= arr1.length - arr2.length; i++) {
			int j;
			for (j = 0; j < arr2.length; j++) {
				if (arr1[i + j] != arr2[j]) {
					break;
				}
			}
			// System.out.println("i = " + i + ", j = " + j);
			if (j == arr2.length) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Solution test = new Solution();
		String s1 = "sadbutsad";
		String s2 = "sad";
		System.out.println(test.strStr(s1, s2));
		String s3 = "leetcode";
		String s4 = "leeto";
		System.out.println(test.strStr(s3, s4));
	}
}
