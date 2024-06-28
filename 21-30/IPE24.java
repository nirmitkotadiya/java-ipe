import java.util.Scanner;

public class IPE24 {
    public static void main(String[] args) {
        // WAP to find 1+1/2+1/3+1/4+………+1/N series.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();
        double sum = 0.0;
        int numerator = 1;
        int denominator = 1;
        for (int i = 1; i <= num; i++) {
            sum += (double) (numerator / denominator);
            System.out.println(numerator + " " + denominator);
            denominator++;
        }
        System.out.println("sum = " + sum);
        sc.close();
    }
}
