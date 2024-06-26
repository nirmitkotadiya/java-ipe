import java.util.Scanner;

public class IPE2 {
    public static void main(String[] args) {
        // WAP that reads two nos. from key board and gives their addition, subtraction,
        // multiplication, division and modulo.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int num2 = sc.nextInt();

        System.out.println("add " + (num1 + num2));
        System.out.println("sub " + (num1 - num2));
        System.out.println("multi " + (num1 * num2));
        System.out.println("div " + (num1 / num2));
        System.out.println("modulo " + (num1 % num2));
    }
}
