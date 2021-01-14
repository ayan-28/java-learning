
// Java code to illustrate order of 
// execution of constructors, static 
// and initialization blocks 
class JavaCodeExecutionOrderExample {

	JavaCodeExecutionOrderExample(int x) {
		System.out.println("ONE argument constructor");
	}

	JavaCodeExecutionOrderExample() {
		System.out.println("No  argument constructor");
	}

	static {
		System.out.println("1st static init");
	}

	{
		System.out.println("1st instance init");
	}

	{
		System.out.println("2nd instance init");
	}

	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new JavaCodeExecutionOrderExample();
		new JavaCodeExecutionOrderExample(8);
	}
}
