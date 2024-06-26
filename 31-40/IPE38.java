import java.util.Scanner;

public class IPE38 {
    public static void main(String[] args) {
        // 38 WAP read in an array of integers and print its elements in reverse order.
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }

        // reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }

}
