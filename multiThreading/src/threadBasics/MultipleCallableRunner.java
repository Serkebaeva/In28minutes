package threadBasics;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import threadBasics.CallableRunner.CallableTask;

public class MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		List<CallableTask> tasks = List.of(new CallableTask("in28min"), new CallableTask("Adam"),
				new CallableTask("Aizada"));
		
		String result = executorService.invokeAny(tasks);
		System.out.println(result);

		executorService.shutdown();
	}

}
