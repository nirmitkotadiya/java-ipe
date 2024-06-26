import java.util.Scanner;

public class IPE43 {
    public static void main(String[] args) {
        // WAP to read two matrix from the user and store the multiplication of two
        // matrix in the resultant matrix. i.e.
        // C=A * B

        Scanner sc = new Scanner(System.in);

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int productMatrix[][] = new int[3][3];
        // matrix 1
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element of " + (i + "," + j));
                matrix1[i][j] = sc.nextInt();
            }
        }

        // matrix 2
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter element of " + (i + "," + j));
                matrix2[i][j] = sc.nextInt();
            }
        }

        // matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // print
        System.out.println("Product of matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
