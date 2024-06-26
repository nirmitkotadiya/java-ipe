import java.util.Scanner;

public class IPE34 {
    // pattern 1
    public static void pattern1(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 2
    public static void pattern2(int num) {
        for (int i = 1; i <= num; i++) {
            char alpha = 'A';
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(j);
                } else {
                    System.out.print(alpha);
                    alpha++;
                }
            }
            System.out.println();
        }
    }

    // pattern 3
    public static void pattern3(int num) {
        char alpha = 'A';
        int number = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    System.out.print(number);
                    number++;
                } else {
                    System.out.print(alpha);
                    alpha++;
                }
            }
            System.out.println();
        }
    }

    // pattern 4
    public static void pattern4(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // pattern 5
    public static void pattern5(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // WAP to Print following pattern using loop statement for n row

        // pattern 1
        // *
        // * *
        // * * *
        // * * * *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        pattern1(num);
        System.out.println();

        // pattern 2
        // 1
        // A B
        // 1 2 3
        // A B C D
        // 1 2 3 4 5
        pattern2(num);
        System.out.println();

        // pattern 3
        // 1
        // A B
        // 2 3 4
        // C D E F
        // 5 6 7 8 9
        pattern3(num);
        System.out.println();

        // pattern 4
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        pattern4(num);
        System.out.println();

        // pattern 5
        // 1
        // 1 2 3
        // 1 2 3 4 5
        // 1 2 3 4 5 6 7
        // 1 2 3 4 5 6 7 8 9
        pattern5(num);
        System.out.println();

        sc.close();
    }
}
