import java.util.Scanner;

public class IPE44 {
    public static void main(String[] args) {
        // 44 WAP to display transpose of given 3*3 matrix.
        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int transposeMatrix[][] = new int[3][3];
        // matrix 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element of " + (i + "," + j));
                matrix1[i][j] = sc.nextInt();
            }
        }

        // tranform matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposeMatrix[i][j] = matrix1[j][i];
            }
        }

        // print
        for (int[] is : transposeMatrix) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
