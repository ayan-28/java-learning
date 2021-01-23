import java.io.File;
import java.io.RandomAccessFile;

class ExceptionHandlingActivity1 {

public static void cat(File named) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(named, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    } finally {
        if (input != null) {
            input.close();
        }
    }
}
}