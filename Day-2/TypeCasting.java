
class TypeCasting {
  public static void main(String[] args) {
	/* Narrowing Type Casting 
		In Narrowing Type Casting, we manually convert one data type into another using the parenthesis.
		
		Note: This is also known as Explicit Type Casting.
	*/
	
    // create double type variable
    double numInDouble = 10.99;
    System.out.println("The double value: " + numInDouble);

    // convert into int type
    int numInInt = (int)numInDouble;
    System.out.println("The integer value: " + numInInt);
	
	// converts int to string type
    String str = String.valueOf(numInInt);
    System.out.println("The string value is: " + str);
	
	// convert string variable to int
    int strToInt = Integer.parseInt(str);
    System.out.println("The integer value is: " + num);
	
	/* Widening Type Casting 
		In Widening Type Casting, Java automatically converts one data type to another data type.
		
		Note: This is also known as Implicit Type Casting.
	*/
	// convert int to double type
    double intToDouble = numInInt;
    System.out.println("The double value: " + intToDouble);
	
  }
}