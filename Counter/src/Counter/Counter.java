package Counter;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("No file name provided!");
			return;
		}

		String fileName = args[0];
		File file = new File("C:\\aisData\\in28Minutes\\Counter\\src\\Counter\\" + fileName);

		Scanner scan = new Scanner(file);
		String string1 = scan.nextLine();

		if (fileName.equals("01.txt")) {
			charCounter(string1);
		} else {
			charCounter2(string1);
		}

		scan.close();
	}

	// Methods to count character occurrences
	public static void charCounter(String str) {
		int lowerCase_a = 0;
		int lowerCase_b = 0;
		int lowerCase_c = 0;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (currentChar == 'a') {
				lowerCase_a++;
			} else if (currentChar == 'b') {
				lowerCase_b++;
			} else if (currentChar == 'c') {
				lowerCase_c++;
			}
		}

		System.out.printf("Occurrences of 'a': %d%n", lowerCase_a);
		System.out.printf("Occurrences of 'b': %d%n", lowerCase_b);
		System.out.printf("Occurrences of 'c': %d%n", lowerCase_c);

	}

	public static void charCounter2(String str) {
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
			} else if (currentChar == 'r') {
				lowerCase_r++;
			} else if (currentChar == 'd') {
				lowerCase_d++;
			}

		}

		System.out.printf("Occurrences of 'h': %d%n", lowerCase_h);
		System.out.printf("Occurrences of 'w': %d%n", lowerCase_w);
		System.out.printf("Occurrences of 'e': %d%n", lowerCase_e);
		System.out.printf("Occurrences of 'l': %d%n", lowerCase_l);
		System.out.printf("Occurrences of 'o': %d%n", lowerCase_o);
		System.out.printf("Occurrences of 'r': %d%n", lowerCase_r);
		System.out.printf("Occurrences of 'd': %d%n", lowerCase_d);

	}

}
