import java.util.Scanner;

public class IPE9 {
    public static void main(String[] args) {
        // 9 WAP to print grade of a student using following rules: Percentage >70 means
        // Grade A
        // Percentage 60-70 means Grade B Percentage 50-60 means Grade C Percentage <50
        // means Grade F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Percentage");
        int percentage = sc.nextInt();

        if (percentage > 70 && percentage < 100) {
            System.out.println("Grade A");
        } else if (percentage <= 70 && percentage > 60) {
            System.out.println("Grade B");
        } else if (percentage <= 60 && percentage >= 50) {
            System.out.println("Grade C");
        } else if (percentage < 50) {
            System.out.println("Grade F");
        }

    }

}
