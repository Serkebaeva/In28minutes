package Counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) throws FileNotFoundException {

		File file = new File("C:\\Users\\user\\Desktop\\sandBox\\01.txt");
		Scanner scan = new Scanner(file);

		File file2 = new File("C:\\Users\\user\\Desktop\\sandBox\\02.txt");
		Scanner scan2 = new Scanner(file2);

		String String1 = scan.nextLine();
		String String2 = scan2.nextLine();

		// Calling the CharCounter method
		Counter counter = new Counter();
		counter.charCounter(String1);
		System.out.println("");
		counter.charCounter(String2);

		scan.close();
		scan2.close();
	}

	// Method to count character occurrences
	public void charCounter(String str) {
		int lowerCase_a = 0;
		int lowerCase_b = 0;
		int lowerCase_c = 0;
		int lowerCase_h = 0;
		int lowerCase_w = 0;
		int lowerCase_e = 0;
		int lowerCase_l = 0;
		int lowerCase_o = 0;
		int lowerCase_r = 0;
		int lowerCase_d = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == 'h') {
				lowerCase_h++;
			} else if (currentChar == 'w') {
				lowerCase_w++;
			} else if (currentChar == 'e') {
				lowerCase_e++;
			} else if (currentChar == 'l') {
				lowerCase_l++;
			} else if (currentChar == 'o') {
				lowerCase_o++;
			} else if (currentChar == 'a') {
				lowerCase_a++;
			} else if (currentChar == 'b') {
				lowerCase_b++;
			} else if (currentChar == 'c') {
				lowerCase_c++;
			} else if (currentChar == 'r') {
				lowerCase_r++;
			} else if (currentChar == 'd') {
				lowerCase_d++;
			}
		}

		// Printing the results
		System.out.printf("Occurrences of 'a': %d%n", lowerCase_a);
		System.out.printf("Occurrences of 'b': %d%n", lowerCase_b);
		System.out.printf("Occurrences of 'c': %d%n", lowerCase_c);
		System.out.printf("Occurrences of 'h': %d%n", lowerCase_h);
		System.out.printf("Occurrences of 'w': %d%n", lowerCase_w);
		System.out.printf("Occurrences of 'e': %d%n", lowerCase_e);
		System.out.printf("Occurrences of 'l': %d%n", lowerCase_l);
		System.out.printf("Occurrences of 'o': %d%n", lowerCase_o);
		System.out.printf("Occurrences of 'r': %d%n", lowerCase_r);
		System.out.printf("Occurrences of 'd': %d%n", lowerCase_d);
	}
}
