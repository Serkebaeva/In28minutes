package methodReferences;

import java.util.List;

public class MethodReferences {

	public static void print(Integer number) {
		System.out.println(number);
	}

	public static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length())
				.forEach(s -> System.out.println(s));

		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(s -> s.length()).forEach(MethodReferences::print);

		Integer max = List.of(23, 45, 67, 34).stream().filter(MethodReferences::isEven).max(Integer::compare).orElse(0);
		System.out.println(max);
	}

}
