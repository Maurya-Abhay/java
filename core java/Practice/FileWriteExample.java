package Practice;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriteExample {
    public static void main(String[] args) {

        try {
            // FileWriter object file create karega agar exist nahi karti
            FileWriter writer = new FileWriter("demo.txt");

            // write() method se data file me likhte hain
            writer.write("Hello, this is file handling in Java.\n");
            writer.write("We are learning Core Java deeply.");

            // close() very important hai warna data properly save nahi hoga
            writer.close();

            System.out.println("Data successfully written to file.");

        } catch (IOException e) {
            // Agar file create ya write me error aata hai to ye chalega
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
