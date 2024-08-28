package imports;

import static java.lang.System.out;
import static java.util.Collections.sort;
import java.math.BigDecimal;
import java.util.ArrayList;


public class ImportsRunner {

	public static void main(String[] args) {
		// no need to Import for String class -> it's inside the package java.lang which
		// is default imports: import java.lang.*;

		BigDecimal db = null;

		// while importing don't use *, that's not a good practice. Better to use
		// specific class import.

		// we can do also import, static, the package for System...
		// import static java.lang.System.out;
		// and because of this import every time, I want to use it, I don't need to specify
		// System anymore, I can just write:

		out.println("Static import");


		/*
		 * Here, we are doing is, a static import of a variable. So, inside the System,
		 * there is a static variable called out and we used static import to import it.
		 */
//**********************************************************************************************
		/*
		 * you can also do a static import with methods. Let's say I'm doing
		 * Collections.sort(new ArrayList<String>());
		 * 
		 * typical import will be import java.util.Collections;
		 * 
		 * static will be import static java.util.Collections.*;
		 * 
		 * So, now, I don't need to specify type here as Collections, I can go directly
		 * as: sort(new ArrayList<String>());
		 * 
		 * These are very useful when I'm, let's say using sort() in a specific class
		 * thousand times...
		 */
		sort(new ArrayList<String>());

	}

}
