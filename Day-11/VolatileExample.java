class VolatileData {
	private volatile int counter = 0;

	public int getCounter() {
		return counter;
	}

	public synchronized void increaseCounter() {
		for(int i=0; i<5000;i++) {
			++counter; // increases the value of counter by 1

			//the above operation is synonymous to => counter = counter +1;
			//Read the counter Value
			//increment the counter value
			//assigning the incremented value to the counter
		}
	}
}

class VolatileThread extends Thread {
	private final VolatileData data;

	public VolatileThread(VolatileData data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);
	}
}

public class VolatileExample {
	private final static int noOfThreads = 2;

	public static void main(String[] args) throws InterruptedException {
		VolatileData volatileData = new VolatileData(); // object of VolatileData class
		Thread[] threads = new Thread[noOfThreads]; // creating Thread array
		for (int i = 0; i < noOfThreads; ++i)
			threads[i] = new VolatileThread(volatileData);
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].start(); // starts all reader threads
		for (int i = 0; i < noOfThreads; ++i)
			threads[i].join(); // wait for all threads
	}
}
