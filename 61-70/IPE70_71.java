import java.io.BufferedReader;
import java.io.FileReader;

public class IPE70_71 {

    public static void main(String[] args) {
        // Write a program that reads file name from user, through command line argument
        // and displays/reads content of the text file on console.

        String fileName = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
