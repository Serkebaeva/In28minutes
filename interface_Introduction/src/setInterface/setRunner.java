package setInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class setRunner {

	public static void main(String[] args) {
		List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F', 'L');
		// as soon as unique --> think of SET (we have TREE, HASH, LinkedHash)

		// if you don't care of either way of sorting or order...
		Set<Character> hashSet = new HashSet<>(characters);
		System.out.println("HashSet: " + hashSet);

		// if sorted
		Set<Character> treeSet = new TreeSet<>(characters);
		System.out.println("treeSet: " + treeSet);

		// in insertion order
		Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
		System.out.println("linkedHashSet: " + linkedHashSet);



	}

}
