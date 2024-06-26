import java.util.Scanner;

public class IPE30 {
    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static void isPrimeList(int num) {
        for (int i = 2; i <= num; i++) {
            // prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        // 30 WAP to check whether the given number is Prime or not. OR Write a Java
        // program to find and print prime
        // numbers between the numbers 1 to n, where the number n should be read from
        // the keyboard.

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrimeList(num);
        System.out.println();
        System.out.println(isPrime(num));
        ;
    }

}
