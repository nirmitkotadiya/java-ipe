import java.util.Scanner;

public class IPE40 {
    public static void main(String[] args) {
        // 40 WAP to find maximum element from 3*3 Matrices.
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter element of " + (i + " " + j));
                matrix[i][j] = sc.nextInt();
            }
        }
        int maxElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }

        System.out.println("The max element in the matrix is : " + maxElement);
        sc.close();

    }

}
