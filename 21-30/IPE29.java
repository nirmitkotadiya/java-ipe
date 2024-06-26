import java.util.Scanner;

public class IPE29 {
    public static void main(String[] args) {
        // 29 WAP to find out Armstrong Numbers. Example: - 153 is an Armstrong Number.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int originalNumber = num;
        int armNumber = 0;
        int numDigit = String.valueOf(num).length();
        while (num > 0) {
            int lastDigit = num % 10;
            armNumber = (int) (armNumber + (Math.pow(lastDigit, numDigit)));
            num /= 10;
        }
        if (originalNumber == armNumber) {
            System.out.println(armNumber + " is armstrong number");
        } else {
            System.out.println(armNumber + " is not armstrong number");

        }
    }

}
