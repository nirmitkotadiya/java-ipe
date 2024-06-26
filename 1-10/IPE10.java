import java.util.Scanner;

public class IPE10 {
    public static void main(String[] args) {
        // 10 WAP to perform addition, multiplication, subtraction and division with
        // Switch statement.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2 ");
        int num2 = sc.nextInt();
        System.out.println("Enter choice to perform");
        String ch = sc.next();
        switch (ch) {
            case "+":
                System.out.println("add " + (num1 + num2));
                break;
            case "-":
                System.out.println("add " + (num1 - num2));
                break;
            case "*":
                System.out.println("add " + (num1 * num2));
                break;
            case "/":
                System.out.println("add " + (num1 / num2));
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }
    }

}
