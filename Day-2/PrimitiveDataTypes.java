
public class PrimitiveDataTypes {

    public static void main(String[] args) {
		/* Primitive data types */
		byte b = 5; //8 bits - 128 to 127
		short s = 128; //16 bits
		int i = 40000; //32 bits
		long l = 222222222; //64 bits
		float f = 4.0f; //32 bits floating point
		double d = 67.0; //64 bits floating point

		char c = 'A'; //16 bits '\u0000' to '\uffff'

		boolean isTrue = false; //true or false

		//NOTE: float and double are NOT VERY PRECISE - don’t use for financial calculations
		
		/* Literals */
        int dec = 101; // decimal-form literal 
        int oct = 0100; // octal-form literal 
        int hex = 0xFace; // Hexa-decimal form literal 
        int bin = 0b1111; // Binary literal 
        System.out.println(dec); 
        System.out.println(oct); 
        System.out.println(hex); 
        System.out.println(bin); 
    }
}