import java.io.FileWriter;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\lango\\OneDrive\\Desktop\\da_file.txt");

            writer.write("any text in these quotes will be typed into document yo!!!!!!!");
            writer.append("\n a poem by lango"); // adds text to end (append)
            writer.close();

        } catch(IOException e) {

            e.printStackTrace();

        }
    }
}