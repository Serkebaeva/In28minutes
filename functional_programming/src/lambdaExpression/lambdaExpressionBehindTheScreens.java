package lambdaExpression;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
	public boolean test(Integer number) {
		return number % 2 == 0;
	}
}

class SystemOutConsumer implements Consumer<Integer> {
	public void accept(Integer number) {
		System.out.println(number);
	}
}

public class lambdaExpressionBehindTheScreens {

	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48).stream().filter(new EvenNumberPredicate()).forEach(new SystemOutConsumer());
	}
}
