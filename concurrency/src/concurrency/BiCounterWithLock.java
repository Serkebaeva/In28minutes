package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock LockForI = new ReentrantLock();
	Lock LockForJ = new ReentrantLock();

	public void incrementI() {
		LockForI.lock(); // Get Lock for I
		i++;
		LockForI.unlock(); // Release lock for I
	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		LockForJ.lock(); // Get Lock for J
		j++;
		LockForJ.unlock(); // Release lock for J
	}

	public int getJ() {
		return j;
	}

}
