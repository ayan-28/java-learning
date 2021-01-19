class InternExample {
	public static void main(String[] args) {
		// str refers to Object in the Heap Area
		String str = new String("Geeks"); // Line-1

		// str2 refers to Object in SCP Area
		String str2 = str.intern(); // Line-2

		System.out.println("str  = " + str);
		System.out.println("str2  = " + str2);
		
		// Comparing memory locations
		// str is in Heap
		// str2 is in SCP
		System.out.println(str == str2);

		// Comparing only values
		System.out.println(str.equals(str2));

		// S3 refers to Object in the SCP Area
		String s3 = "Geeks"; // Line-3

		System.out.println(str2 == s3);
	}
}
