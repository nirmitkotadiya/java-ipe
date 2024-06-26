import java.util.Scanner;

public class IPE22 {
    public static void main(String[] args) {
        // 22 WAP to find the sum of first N odd numbers.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("sum= " + sum);
    }

}
