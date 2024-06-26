import java.util.Scanner;

public class IPE35 {
    public static void main(String[] args) {
        // 35 WAP to read 10 numbers from user and find Sum, Maximum, Minimum and
        // Average of them.
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        // sum
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // Maximum
        int max = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("max = " + max);

        // minimum
        int min = Integer.MAX_VALUE;
        for (int i : numbers) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("min = " + min);

        // Average
        int avg = sum / numbers.length;
        System.out.println("Average = " + avg);

        sc.close();
    }

}
