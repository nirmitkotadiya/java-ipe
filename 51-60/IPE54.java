import java.util.Scanner;

public class IPE54 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // 54 WAP to generate Fibonacci series of n given numbers using recursion.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();

    }

}
