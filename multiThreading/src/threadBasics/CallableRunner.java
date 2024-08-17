package threadBasics;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableRunner {

	static class CallableTask implements Callable<String> {

		private String name;

		@Override
		public String call() throws Exception {
			Thread.sleep(1000);
			return "Hello " + name;
		}

		public CallableTask(String name) {
			this.name = name;
		}

	}

	public static void main(String[] args) throws Exception, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = executorService.submit(new CallableTask("in28minutes"));
		System.out.print("\n new CallableTask(\"in28minutes\") executed");
		String welcomeMessage = welcomeFuture.get();
		System.out.print(" " + welcomeMessage);
		System.out.print("\n Main completed");
		executorService.shutdown();

	}

}
