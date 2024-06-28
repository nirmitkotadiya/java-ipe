import java.util.Scanner;

public class IPE19 {
    public static void main(String[] args) {
        // 19 WAP to print multiple of N from given range of unsigned integers. For
        // example, if N=5 and range is [17, 45]
        // it prints 20, 25, 30, 35, 40, 45. Take input using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter startRange");
        int startRange = sc.nextInt();
        System.out.println("Enter endRange");
        int endRange = sc.nextInt();
        System.out.println("Enter num");
        int num = sc.nextInt();

        for (int i = startRange; i <= endRange; i++) {
            if (i % num == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
