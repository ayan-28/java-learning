package StringBuilderExamples;

public class Example1 {
	public static void main(String[] argv) {

		// create a StringBuilder object
		// using StringBuilder() constructor
		StringBuilder sb = new StringBuilder();
		
		// print string
				System.out.println("sb capacity = " + sb.capacity());


		sb.append("GFG");

		// print string
		System.out.println("String = " + sb.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder sb1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + sb1.toString());

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = " + str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(sb1);

		// print string
		System.out.println("String3 = " + str3.toString());
	}
}
