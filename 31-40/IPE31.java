import java.util.Scanner;

public class IPE31 {

    public static boolean perfectNum(int num) {
        if (num <= 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        // 31 WAP to check whether a number is a perfect number or not. (e.g. 123 is a
        // perfect no i.e.1+2+3=1*2*3)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check perfect or not : ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (perfectNum(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}