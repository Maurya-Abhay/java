package Practice;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FileReadExample {
    public static void main(String[] args) {

        try {
            // FileReader file open karta hai
            FileReader reader = new FileReader("demo.txt");

            // BufferedReader fast reading ke liye use hota hai
            BufferedReader br = new BufferedReader(reader);

            String line;

            // readLine() ek line read karta hai
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }
}
