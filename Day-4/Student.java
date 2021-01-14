// Constructor overloading is a technique in Java in which a class can have any number of constructors that differ in parameter lists.
class Student {
	int id;
	String name;
	int age;

	Student(int i, String n) {
		id = i;
		name = n;
	}

	Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		Student s1 = new Student(100, "Karan");
		Student s2 = new Student(200, "Aryan", 22);
		s1.display();
		s2.display();
	}
}