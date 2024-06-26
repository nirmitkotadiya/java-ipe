import java.util.Scanner;

public class IPE26 {

    public static void main(String[] args) {
        // 26 WAP to generate Fibonacci series of numbers
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= num; i++) {
            System.out.println(firstTerm);
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
