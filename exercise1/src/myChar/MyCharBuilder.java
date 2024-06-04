package myChar;

public class MyCharBuilder {
	
	public static void main(String[] args) {
		MyChar myChar = new MyChar('a');
		System.out.println(myChar.isVowel()); // a, e, i, o, u and Capitals
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabet());
		myChar.printCaseAlphabets();
	}
}
