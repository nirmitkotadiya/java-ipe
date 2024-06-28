import java.util.Scanner;

public class IPE55 {
    public static int sumOfDigit(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumOfDigit(n / 10);

    }

    public static void main(String[] args) {
        // 55 WAP to find sum of digit of given number using recursion.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        System.out.println(sumOfDigit(num));
        sc.close();
    }

}
