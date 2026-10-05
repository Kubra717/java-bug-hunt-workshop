import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingDemo {

    public static void main(String[] args) {

        try {
            loadFile();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    static void loadFile() {

        try {
            // Trying to open a file that does not exist
            FileReader reader = new FileReader("data.txt");

            System.out.println("File opened successfully.");

            reader.close();

        } catch (IOException e) {

            // GOOD:
            // Add useful context AND preserve the original exception
            throw new RuntimeException("Failed to load file", e);
        }
    }
}