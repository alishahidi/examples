import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("test.txt");
        if (file.exists()) {
            System.out.println("file test.txt exist");
        } else {
            System.out.println("file test.txt dosent exist");
        }

        try {
            FileWriter writer = new FileWriter("append.txt", Charset.forName("UTF-8"), true);
            writer.write("This is test file\n");
            writer.write("This is test file content");
            writer.close();
        } catch (IOException e) {
            System.out.println("We have some error");
        }

    }
}
