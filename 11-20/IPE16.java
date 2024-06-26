import java.util.Scanner;

public class IPE16 {
    public static void main(String[] args) {
        // 16 WAP to display multiplication table.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

}
