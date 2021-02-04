import java.util.*;

public class ArrayDequeExample {
	public static void main(String[] args) {

		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		deque.add("Ajay");

		System.out.println("Accessing Queue from front");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

		System.out.println("\nAccessing Queue from rear");
		// Returns an iterator over the elements in this deque in reversesequential
		// order. The elements will be returned in order fromlast (tail) to first
		// (head).
		Iterator it = deque.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}