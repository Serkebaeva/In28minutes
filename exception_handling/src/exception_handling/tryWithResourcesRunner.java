package exception_handling;

import java.util.Scanner;

public class tryWithResourcesRunner {


	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[21];
		} catch(Exception ex){
			ex.printStackTrace();
		} finally {
			
		}

			/*So, 1 of the important thing is, this scanner implements a class called AutoCloseable... 
			Here catch & finally not really mandatory, but you can also add them.. */

	}

}
