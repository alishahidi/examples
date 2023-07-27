import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            FileReader reader = new FileReader("nice.txt", Charset.forName("UTF-8"));
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            System.out.println();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not exist");
        } catch (IOException e) {
            System.out.println("Somting went wrong");
        }
    }
}
