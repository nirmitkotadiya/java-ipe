import java.util.Scanner;

public class IPE50 {
    public static int intgetPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void main(String[] args) {
        // 50 A pentagonal number is defined as n(3n–1)/2 for n = 1, 2, . . ., and so
        // on. Therefore, the first few numbers are 1, 5, 12, 22, Write a method with
        // the following header that returns a pentagonal number:
        // public static intgetPentagonalNumber(int n)
        // Write a test program that uses this method to display the first 100
        // pentagonal numbers with 10 numbers on each line.
        Scanner sc = new Scanner(System.in);
        final int NUMBERS_PER_LINE = 10;
        final int TOTAL_NUMBERS = 100;

        for (int i = 1; i <= TOTAL_NUMBERS; i++) {
            System.out.print(intgetPentagonalNumber(i) + " ");

            if (i % NUMBERS_PER_LINE == 0) {
                System.out.println();
            }

        }
        sc.close();

    }
}
