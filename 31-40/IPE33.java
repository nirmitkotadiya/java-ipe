import java.util.Scanner;

public class IPE33 {
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
            for (int j = 1; j <= i * 2; j++) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }
    }

    // pattern 3
    public static void pattern3(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    // pattern 4
    public static void pattern4(int num) {
        int number = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;

            }
            System.out.println();
        }
    }

    // pattern 5
    public static void pattern5(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 1) {
                    System.out.print("*");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }

    // pattern 6
    public static void pattern6(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 7
    public static void pattern7(int num) {
        for (int i = 1; i <= num; i++) {
            int n = num - i + 1;
            for (int j = num; j >= i; j--) {
                System.out.print(n);
                n--;
            }
            System.out.println();
        }
    }

    // pattern 8
    public static void pattern8(int num) {
        for (int i = 1; i <= num; i++) {
            int n = i;
            for (int j = num; j >= i; j--) {
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // WAP to print following pattern using loop statement for n row.
        // pattern 1
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        pattern1(num);
        System.out.println();

        // pattern 2
        // 1
        // 1 3
        // 1 3 5
        // 1 3 5 7
        pattern2(num);
        System.out.println();

        // pattern 3
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1

        pattern3(num);
        System.out.println();

        // pattern 4
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        pattern4(num);
        System.out.println();

        // pattern 5
        // *
        // # #
        // * * *
        // # # # #
        // * * * * *
        // # # # # # #
        // * * * * * * *

        pattern5(num);
        System.out.println();

        // pattern 6
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        pattern6(num);
        System.out.println();

        // pattern 7
        // 54321
        // 4321
        // 321
        // 21
        // 1

        pattern7(num);
        System.out.println();

        // pattern 8
        // 1 2 3 4 5
        // 2 3 4 5
        // 3 4 5
        // 4 5
        // 5

        pattern8(num);
        System.out.println();
    }

}
