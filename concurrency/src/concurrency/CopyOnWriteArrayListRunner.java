package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();

		// Threads 3 - let's say, there are 3 only threads which are inserting values, very rarely 
		list.add("Ant");
		list.add("Bat");
		list.add("Cat");

		// Threads 10 000 - let's assume , there are 10 000 threads which are actually at a
		// point in time, looping around the thing..
		for (String string : list) {
			System.out.println(string);
		}

	}

}
