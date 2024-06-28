import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class IPE73 {
    public static void main(String[] args) {
        // Write a program that counts the no. of words in a text file. The file name is
        // passed as a command line argument. The program should check whether the file
        // exists or not. The words in the file are separated by white space characters.

        String fileName = args[0];
        File f = new File(fileName);

        // check file exist or not
        if (!f.exists()) {
            System.out.println("file not exists");
            return;
        }

        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                String[] s = line.split(" ");
                for (int i = 0; i < s.length; i++) {
                    wordCount++;
                }
                line = br.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("wordCount = " + wordCount);
    }
}
