import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> CarManufacturerQueue = new LinkedList<>();

		// Add Element to Queue
		CarManufacturerQueue.add("Maruti");
		CarManufacturerQueue.add("Tata");
		CarManufacturerQueue.add("Honda");
		CarManufacturerQueue.add("Mahindra");

		// Take Element From Queue
		// The poll() method returns null if the Queue is empty.
		System.out.println("Removing element at the front of the queue : " + CarManufacturerQueue.poll());

		// The remove() method throws an exception if the Queue is empty.
		String elementRemoved = CarManufacturerQueue.remove();
		System.out.println("The element taken from the queue is : " + elementRemoved);

		// Peek at the Queue
		System.out.println("Checking element at the front of the queue : " + CarManufacturerQueue.peek());

		// Check if Queue Contains Element
		boolean containsHonda = CarManufacturerQueue.contains("Honda");

		// access via Iterator
		Iterator<String> iterator = CarManufacturerQueue.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
		}

		// access via new for-loop
		for (String element : CarManufacturerQueue) {
			System.out.println(element);
		}
	}
}
