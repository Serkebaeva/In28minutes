package userInput;

import java.util.Scanner;

public class UserInput {
	
	    Scanner scanner = new Scanner(System.in);
	    private int number1;
	    private int number2;
	    private int choice;
	    
	    public int getNumber1() {
	    	System.out.print("Enter Number1: ");
	    	this.number1 = scanner.nextInt();
			return number1;
	    }
	    
		public int getNumber2() {
			System.out.print("Enter Number2: ");
			this.number2 = scanner.nextInt();
			return number2;
		}

		public int getChoice(){
			System.out.println("Choices available are: ");
			System.out.println("1 + Add: ");
			System.out.println("2 - Subtract: ");
			System.out.println("3 / Divide: ");
			System.out.println("4 * Multiply: ");

			System.out.print("Enter Choice: ");
			this.choice = scanner.nextInt();
			return choice;
		}
		
		public void printChoice() {
			System.out.printf("Your choices are: Number1 -> %d, Number2 -> %d, Choice for action: %d", number1, number2,
					choice).println();
		}

		public int calculateChoice() {

			if (choice == 1) {
				int sum = number1 + number2;
				System.out.printf("Result is: %d", sum).println();
				return sum;
			} else if (choice == 2) {
				int sum = number1 - number2;
				System.out.printf("Result is: %d", sum).println();
				return sum;
			} else if (choice == 3) {
				int sum = number1 / number2;
				System.out.printf("Result is: %d", sum).println();
				return sum;
			} else if (choice == 4) {
				int sum = number1 * number2;
				System.out.printf("Result is: %d", sum).println();
				return sum;
			} else {
				System.out.println("Choice is incorrect!");
				return 0;
			}

		}

}
