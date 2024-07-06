package queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length()); // -> will give to us shortLength words first..
		// Integer.compare(value2.length(), value1.length()); -> will give to us
		// longLength words first..
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

	}

}
