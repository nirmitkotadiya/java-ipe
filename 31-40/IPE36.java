import java.util.Scanner;

public class IPE36 {
    public static void main(String[] args) {
        // WAP which declares array of 10 integers, enter data and sum all the
        // elements which are even. Also find
        // maximum number from them.

        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }

        // even elements sum
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i % 2 == 0) {
                sum += i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("max = " + max);
        sc.close();
    }

}
