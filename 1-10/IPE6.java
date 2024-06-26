import java.util.Scanner;

public class IPE6 {
    public static void main(String[] args) {
        // 6. WAP to swap two numbers with and without using temporary variale

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " " + num2);
        // with
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("temp using");
        System.out.println(num1 + " " + num2);

        // without using temporary variale
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("without temp using");
        System.out.println(num1 + " " + num2);

    }
}
