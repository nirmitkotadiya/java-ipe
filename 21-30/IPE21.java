import java.util.Scanner;

public class IPE21 {
    public static void main(String[] args) {
        // 21 WAP to count ODD and EVEN numbers from given 10 numbers.

        int numbers[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter num ");
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even");
            } else {
                System.out.println(numbers[i] + " is odd");
            }
        }
    }

}
