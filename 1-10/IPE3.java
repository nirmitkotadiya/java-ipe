import java.util.Scanner;

public class IPE3 {
    public static void main(String[] args) {
        // 3 WAP to enter three subject marks, and calculate total, percentage of
        // student and display the same in proper format.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter sub1 mark");
        // int sub1 = sc.nextInt();
        // System.out.println("Enter sub2 mark");
        // int sub2 = sc.nextInt();
        // System.out.println("Enter sub3 mark");
        // int sub3 = sc.nextInt();

        // // total
        // int total = (sub1 + sub2 + sub3);
        // System.out.println("total " + total);
        // // percentage
        // System.out.println("percentage " + (total) / 3);

        // using array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total subject");
        int totalSub = sc.nextInt();
        int[] mark = new int[totalSub];
        for (int i = 0; i < totalSub; i++) {
            System.out.println("Enter sub" + (i + 1) + " marks");
            mark[i] = sc.nextInt();
        }
        // total
        int total = 0;
        for (int i = 0; i < mark.length; i++) {
            total += mark[i];
        }

        // percentage
        int percentage = total / totalSub;
        System.out.println("percentage " + percentage);
    }
}
