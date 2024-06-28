import java.util.Scanner;

public class IPE53 {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int nCr(int n, int r) {
        int nfact = factorial(n);
        int rfact = factorial(r);
        int nmrfact = factorial(n - r);

        return nfact / (rfact * nmrfact);
    }

    public static void main(String[] args) {
        // 53 WAP to calculate nCr using recursion. nCr = n! / (r! * (n-r)!)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        System.out.println("Enter r");
        int r = sc.nextInt();
        if (r > n) {
            System.out.println("Invalid input: r cannot be greater than n.");
        } else {
            int result = nCr(n, r);
            System.out.println("nCr = " + result);
        }
        sc.close();
    }
}
