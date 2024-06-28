import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IPE74 {

    public static void main(String[] args) throws IOException {
        // Write a program to read the content of a file into a character array and
        // write it into another file. Get names of the files from command line

        String fileName = args[0];
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int num = br.read();
        while (num != -1) {
            bw.write(num);
            num = br.read();
        }
        br.close();
        bw.close();
    }
}
