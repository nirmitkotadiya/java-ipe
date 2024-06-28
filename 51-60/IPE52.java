import java.util.Scanner;

public class IPE52 {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static int gcd1(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcd1(a - b, b);
        }
        return gcd1(a, b - a);
    }

    public static void main(String[] args) {
        // 52 WAP to find GCD of the 2 numbers using recursion.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 1 ");
        int num2 = sc.nextInt();

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd(num1, num2));
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd1(num1, num2));
        sc.close();
    }

}
