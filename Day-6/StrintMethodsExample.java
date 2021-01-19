public class StrintMethodsExample {
	public static void main(String[] args) {
		String s = "  Sachin  ";

		System.out.println(s);//  Sachin

		// trim() method
		s = s.trim();
		System.out.println(s);//Sachin

		// toUpperCase() and toLowerCase() method
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin

		// startsWith() and endsWith() method
		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("n1"));// false

		// charAt() method
		System.out.println(s.charAt(3));// h

		// length() method
		System.out.println(s.length());// 6

		// replace() method
		String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s1.replace("Java", "Kava");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);

		// split() method
		String arr[] = s1.split("\\.");
		for (String a : arr) {
			System.out.println(a);
		}

		// valueOf() method
		int a = 10;
		s = String.valueOf(a);
		System.out.println(a + 10);
	}
}
