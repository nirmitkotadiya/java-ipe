import java.util.Scanner;

public class IPE57 {
    public static void main(String[] args) {
        // Write a program that creates and initializes a four integer element array.
        // Calculate and display the average of
        // its values.
        int num[] = new int[4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Enter number : " + (i + 1));
            num[i] = sc.nextInt();
        }
        // avg
        int sum = 0;
        for (int i : num) {
            sum += i;
        }
        int avg = sum / num.length;
        System.out.println("Average =" + avg);
        sc.close();
    }
}
