import java.util.Scanner;

public class IPE39 {
    public static void main(String[] args) {
        // 39 WAP to add two 3 x 3 Matrix or 2x2 matrix .
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size : ");
        int size = sc.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Invalid size , please enter 2*2 or 3*3");
            return;
        }
        int matrix1[][] = new int[size][size];
        int matrix2[][] = new int[size][size];
        int matrix3[][] = new int[size][size];
        // matrix 1
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.println("Enter element of " + (i + "," + j));
                matrix1[i][j] = sc.nextInt();
            }
        }

        // matrix 2
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.println("Enter element of " + (i + "," + j));
                matrix2[i][j] = sc.nextInt();
            }
        }

        // add matrix 3
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        // print matrix 3
        for (int[] is : matrix3) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
