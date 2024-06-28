import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IPE72 {
    public static void main(String[] args) throws IOException {
        // Write a program to replace all “word1” by “word2” from a file1, and output is
        // written to file2 file and display the no. of replacement.
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("file1.txt"));
        BufferedWriter bw2 = new BufferedWriter(new FileWriter("file2.txt"));
        BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
        String word1 = "Hello";
        String word2 = "hi";
        bw1.write("Hello How are you?");
        bw1.newLine();
        bw1.write("Hello Nirmit Hello");
        bw1.newLine();
        bw1.close();

        int replacementCount = 0;
        String line = br1.readLine();
        while (line != null) {
            String modifiedLine = line.replaceAll(word1, word2);
            bw2.write(modifiedLine);
            line = br1.readLine();
            if (modifiedLine.contains(word2)) {
                replacementCount++;
            }
        }

        System.out.println("replacement count = " + replacementCount);
        bw2.close();
    }
}
