package toLowerCase;

class Solution {
	public String lowerCase(String s) {
		if (s.length() == 0) {
			return s;
		}

		StringBuilder str = new StringBuilder();
		char[] strArray = s.toCharArray();
		for (char ch : strArray) {
			if (ch >= 'A' && ch <= 'Z') {
				str.append((char) (ch + 32));
			} else {
				str.append(ch);
			}
		}

		return str.toString();

	}

	public static void main(String[] args) {
		Solution object = new Solution();
		String s1 = "Hello";
		System.out.println(object.lowerCase(s1));
		String s2 = "here";
		System.out.println(object.lowerCase(s2));
		String s3 = "LOVELY";
		System.out.println(object.lowerCase(s3));
	}

}
