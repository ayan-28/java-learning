import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class OutputStreamExample {

	public static void main(String[] args) {
		try {
			OutputStream outStream = new FileOutputStream("ExampleFile.txt");

			outStream.write('A');
			Scanner sc = new Scanner(System.in);
			int offset = 0;
			String str;
			while(!(str = sc.nextLine()).equals("x")) {
				System.out.println(str);
				outStream.write(str.getBytes());
				outStream.write('\n');
			}

			System.out.println("The output is written to a file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
