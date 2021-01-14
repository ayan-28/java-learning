
public class Person {

	// attributes or state or member variables
	String name;
	int age;
	static String country = "India";
	
	//Constructor
	Person() {
		age = 18;
	}
	
	Person(String nameArg, int ageArg) {
		age = ageArg;
		name = nameArg;
	}

	// behaviours or methods
	public void showPersonDetails() {
		System.out.printf("name : %s and age : %d \n", name, age);
	}
	
	
	//main() method for testing and executing the program
	public static void main(String args[]) {
		System.out.println("country :" + country);
		
		//Object reference declaration and 		
		//Object Creation
		Person Obj1 = new Person("John", 29);
		
		//method call
		Obj1.showPersonDetails();
	}

}
