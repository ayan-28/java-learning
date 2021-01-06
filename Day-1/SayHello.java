import java.util.Scanner; // Bring in the scanner to read input

public class SayHello {

    /**
     * @param args - the command line arguments
     */
    public static void main(String[] args) {
		//Say Hello 
		String yourName;    // Set aside some memory, refer to it as yourName
        yourName = "John Doe";  // set memory at yourName to value "John Doe"
        System.out.printf("Hello, %s!!\n", yourName); // say hello
		
		//Say Hello with Keyboard interaction
        Scanner input = new Scanner(System.in); // make new object of class Scanner, based on System.in and call it input
        System.out.print("Enter your name ==> ");                
        String name = input.nextLine();
        System.out.printf("Hello, %s!! \n", name); // say hello
    }
}
