package reverseString;

import java.util.Arrays;

//decision via arrays:
/* public class ReverseString { 

	// method reversing an integer array
	public static int[] reverseArray(int[] array) {
		if (array.length == 0) {
			return array;
		}

		int[] reversedArray = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;
	}

	// method reversing a char array
	public static char[] reverseArray(String str) {
		char[] array = str.toCharArray();
		if (array.length == 0) {
			return array;
		}

		char[] reversedArray = new char[array.length];
		for (int i = 0; i < array.length; i++) {
			reversedArray[i] = array[array.length - 1 - i];
		}
		return reversedArray;

	}

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 5, 4, 32, 2, 1 };
		System.out.println(Arrays.toString(ReverseString.reverseArray(array1)));
		System.out.println(Arrays.toString(ReverseString.reverseArray(array2)));

		String testString = "Hello";
		System.out.println(Arrays.toString(ReverseString.reverseArray(testString)));
		String testString2 = "Hello World";
		System.out.println(Arrays.toString(ReverseString.reverseArray(testString2)));
		String testString3 = "";
		System.out.println(Arrays.toString(ReverseString.reverseArray(testString3)));
	}

} */

//decision via StringBuilder
public class ReverseString { 
    
	public static String reverseString(String s) {
	 StringBuilder s2 = new StringBuilder();
	 for (int i = s.length() - 1; i >= 0; i--) {
		 s2.append(s.charAt(i));
	 }

	 String reverseString = s2.toString();
	 return reverseString;
 }

 public static void main(String[] args) {
	 System.out.println(reverseString("race34 a car")); 
	 System.out.println(reverseString("A man, a plan, a canal: Panama")); 
	 System.out.println(reverseString(" "));
 }
}
