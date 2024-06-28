import java.util.Scanner;

public class IPE51 {
    public static void reverse(int number) {
        int reverseNum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            number /= 10;

        }
        System.out.println(reverseNum);
    }

    public static void main(String[] args) {
        // 51 Write a method with the following header to display an integer in reverse
        // order:
        // public static void reverse(int number)
        // For example, reverse(3456) displays 6543. Write a test program that prompts
        // the user to enter an integer and displays its reversal. Unit-2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();

        reverse(num);
        sc.close();
    }
}
