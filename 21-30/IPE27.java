import java.util.Scanner;

public class IPE27 {

    public static void main(String[] args) {
        // 27 WAP to reverse a number.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverseNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            num = num / 10;
        }
        System.out.println(reverseNumber);
    }
}
