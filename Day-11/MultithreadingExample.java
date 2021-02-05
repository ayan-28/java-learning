
public class MultithreadingExample extends Thread {
	int sleepInterval;
	int counter; //40 //60
	
	
	
	public MultithreadingExample(int sleepInterval) {
		this.sleepInterval = sleepInterval;
	}

	@Override
	public void run() {
		printSomething();
		
		//Consider Processing time for example
		try {
			Thread.sleep(sleepInterval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() +" Woke up from sleep");
	}
	
	synchronized private void printSomething() {
		System.out.println("I am processing MultithreadingExample thread : " + this.getName());
	}
	
	public static void main(String args[]) throws InterruptedException {
		Thread thread1 = new MultithreadingExample(0);		
		Thread thread2 = new MultithreadingExample(0);

		System.out.println("Starting the thread execution.");
		
		thread1.start();
		thread2.start();
		
		thread2.join();
		thread1.join();
				
		System.out.println("Completed the thread execution from main().");

	}
}
