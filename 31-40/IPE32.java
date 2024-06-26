import java.util.Scanner;

public class IPE32 {

    public static void main(String[] args) {
        // 32 WAP to find out sum of first and last digit of a given number.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int num = sc.nextInt();

        int lastDigit = num % 10;

        int firstDigit = (int) (num / Math.pow(10, String.valueOf(num).length() - 1));
        System.out.println("first digit " + firstDigit);
        System.out.println("last digit " + lastDigit);
    }
}