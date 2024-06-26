import java.util.Scanner;

public class IPE7 {
    public static void main(String[] args) {
        // 7 WAP to determine a given number is ‘odd’ or ‘even’ and print the following
        // message “Number is ODD” or
        // “Number is Even” (i) Without using else option. (ii) With else option.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();

        // Without using else option.
        if (num % 2 == 0) {
            System.out.println("even");
        }
        if (num % 2 != 0) {
            System.out.println("odd");
        }

        // With else option.
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
