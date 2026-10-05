import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {

    public static void main(String[] args) {

        String path = "data.txt";

        // BAD approach
        readFileBad(path);

        // GOOD approach
        readFileGood(path);
    }

    // BAD: Resource may not be closed if readLine() throws an exception
    static void readFileBad(String path) {

        BufferedReader r = null;

        try {
            
            r = new BufferedReader(new FileReader(path));

            String line = r.readLine();

            System.out.println("BAD: " + line);

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (r != null) {
                    r.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // GOOD: try-with-resources automatically closes the resource
    static void readFileGood(String path) {

        try (BufferedReader r = new BufferedReader(new FileReader(path))) {

            String line = r.readLine();

            System.out.println("GOOD: " + line);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}