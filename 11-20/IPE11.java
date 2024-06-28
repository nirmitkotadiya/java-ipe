import java.util.Scanner;

public class IPE11 {
    public static void main(String[] args) {
        // 11 WAP that reads number from 1 to 7 and accordingly it should print MONDAY
        // to SUNDAY.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Enter valid choice");
                break;
        }
    }
}
