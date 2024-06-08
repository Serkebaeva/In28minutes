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
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		int[] charCount = new int[26]; // Array to store counts for a-z

		while (scan.hasNextLine()) {
			String string1 = scan.nextLine();
			for (char ch : string1.toCharArray()) {
				if (Character.isLowerCase(ch)) {
					charCount[ch - 'a']++;
				}
			}
		}

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				char letter = (char) (i + 'a');
				System.out.println(letter + ": " + charCount[i]);

				/*
				 * Conversion to Character: (i + 'a') performs arithmetic with a character and
				 * an integer. Since 'a' is 97 (its ASCII value), adding i to 'a' yields the
				 * ASCII value of the corresponding letter. Casting to char: The result of (i +
				 * 'a') is an integer, but we want to treat it as a character. So, we cast it to
				 * char. The cast (char) (i + 'a') converts the resulting integer back to a
				 * character.
				 */
			}
		}

		scan.close();
	}
}



