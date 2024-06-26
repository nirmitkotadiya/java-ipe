import java.util.Scanner;

public class IPE41 {
    public static void main(String[] args) {
        // 41 WAP to find the minimum value from the array of 3 x 3.

        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter element of " + (i + " " + j));
                matrix[i][j] = sc.nextInt();
            }
        }
        int minElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minElement) {
                    minElement = matrix[i][j];
                }
            }
        }

        System.out.println("The min element in the matrix is : " + minElement);
        sc.close();

    }

}
