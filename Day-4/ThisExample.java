
// Java code for using this() to  
// invoke current class constructor 
class ThisExample {
	int a;
	int b;

	// Default constructor
	ThisExample() {
		this(10, 20);
		System.out.println("Inside  default constructor \n");
	}

	// Parameterized constructor
	ThisExample(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor");
	}

	public static void main(String[] args) {
		ThisExample object = new ThisExample();
	}
}
