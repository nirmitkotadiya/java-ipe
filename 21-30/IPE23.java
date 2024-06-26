import java.util.Scanner;

public class IPE23 {

    public static void main(String[] args) {
        // 23 WAP to find 1+3/5+5/7+7/9+… series. Print addition of first N part.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = sc.nextInt();

        double sum = 0.0;
        int numerator = 1;
        int denominator = 1;
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                sum += numerator;
            } else {
                numerator += 2;
                denominator += 2;
                sum += (double) numerator / denominator;
            }
        }
        System.out.println("sum = " + sum);
    }

}
