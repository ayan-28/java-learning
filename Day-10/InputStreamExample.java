import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {

	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("ExampleFile.txt");
			
			int i = 0;
			while ((i = inputStream.read()) != -1) {
				System.out.print((char) i);
			}
			
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
