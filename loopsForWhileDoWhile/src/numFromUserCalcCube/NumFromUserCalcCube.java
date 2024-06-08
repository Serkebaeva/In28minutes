package numFromUserCalcCube;

import java.util.Scanner;

public class NumFromUserCalcCube {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = -1;


		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
			}

			System.out.print("Enter a number: ");
			number = scan.nextInt();
		} while (number >= 0);

		System.out.print("Thank you! Have fun!");

	}

}
