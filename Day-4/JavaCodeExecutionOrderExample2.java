class Parent {
	public Parent() {
		System.out.println("Parent Constructor");
	}

	static {
		System.out.println("Parent static block");
	}
	{
		System.out.println("Parent initialisation  block");
	}
}

class Child extends Parent {
	{
		System.out.println("Child initialisation block");
	}
	static {
		System.out.println("Child static block");
	}

	public Child() {
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		new Child();
	}
}

public class JavaCodeExecutionOrderExample2 {
	public static void main(String[] args) {
		new Child();
	}
}