import java.util.Scanner;

public class IPE28 {
    public static void main(String[] args) {
        // 28 WAP to calculate sum of digits (Ex: 123 => so sum of digit = 1+2+3=6)

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("sum= " + sum);
    }

}
