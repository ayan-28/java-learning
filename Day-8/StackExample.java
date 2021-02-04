import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack<>();
		stack.push(120);
		stack.push("Rahul");
		stack.push(55);
		stack.push(65);
		stack.push(55);
		
		System.out.println("Stack : " + stack);
		
		System.out.println("The element on the top of stack : " + stack.peek());
		
		System.out.println("The element removed from top is : " + stack.pop());
		
		System.out.println("Printing the Stack again : " + stack);
		
		System.out.println("Is the stack empty ? " + stack.isEmpty());
		
		System.out.println("Size of the stack : " + stack.size());
		
		System.out.println(stack.empty());

	}

}
