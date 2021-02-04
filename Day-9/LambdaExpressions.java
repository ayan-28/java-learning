public class LambdaExpressions {

	// main() method
	public static void main(String[] args) {
		// implementation - 1
		StrConcat sConcat2 = new StrConcat() {

			@Override
			public String concat(String s1, String s2) {
				// TODO Auto-generated method stub
				return null;
			}
		};

		// implementation - 2
		StrConcat sConcat = (str1, str2) -> str1 + str2;

		System.out.println("The output is : " + sConcat.concat("Hello ", "World!!!!!"));
		
		//StrCompare example
		StrCompare isStringEqual = (x, y) -> {
			x = x+ " Str";
			return x.equalsIgnoreCase(y);
		};
		
		System.out.println("The StrCompareoutput : " + isStringEqual.compareWithCase("Hello", "hello Str"));
	}

}

@FunctionalInterface
interface StrConcat {
	String concat(String s1, String s2);
	
	default void printStr(String s) {
		System.out.println(s);
	}
}

@FunctionalInterface
interface StrCompare {
	boolean compareWithCase(String s1, String s2);
}