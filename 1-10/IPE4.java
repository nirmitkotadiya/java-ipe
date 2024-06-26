import java.util.Scanner;

public class IPE4 {
    public static void main(String[] args) {
        // 4. WAP to convert days into months and days.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total days ");
        int totalDays = sc.nextInt();

        int totalMonth = totalDays / 30;
        int remainingDays = totalDays % 30;

        System.out.println("total month " + totalMonth);
        System.out.println("total days " + remainingDays);
    }
}
