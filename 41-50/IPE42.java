import java.util.Scanner;

public class IPE42 {
    public static void main(String[] args) {
        // 42 WAP to count number of positive, negative and zero elements from 3 x 3
        // matrix.
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter element of " + (i + " " + j));
                matrix[i][j] = sc.nextInt();
            }
        }

        // positive, negative ,zero
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    positive++;
                } else if (matrix[i][j] < 0) {
                    negative++;
                } else {
                    zero++;
                }
            }
        }
        System.out.println("total positive count = " + positive);
        System.out.println("total negative count = " + negative);
        System.out.println("total zero count = " + zero);
        sc.close();
    }

}
