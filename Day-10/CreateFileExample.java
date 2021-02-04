import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileExample {
	static String data = "This is example data2 to be written to a file";

	public static void main(String[] args) throws IOException {
		File file = new File("file2.txt");
		boolean isFileCreatedFlag = file.createNewFile();
		if(isFileCreatedFlag) {
			System.out.println("The file is created");
		}
		
//		FileWriter fileWriter = new FileWriter("file2.txt");
//		fileWriter.write(data);
//		
//		System.out.println("The file has been successfully written");
//		fileWriter.close();
		
		FileReader fileReader = new FileReader("file2.txt");
		char[] inputFromFile = new char[10];
		
		BufferedReader br = new BufferedReader(fileReader);
		
		System.out.println(" The out of the file is : \n");

		br.read(inputFromFile);
		System.out.println(inputFromFile);
		
		fileReader.close();
		br.close();
	}

}
