import java.util.Scanner;

class MatrixSumThread extends Thread {
    private int[] row;
    private int rowIndex;
    private int rowSum;

    public MatrixSumThread(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    @Override
    public void run() {
        rowSum = 0;
        for (int value : row) {
            rowSum += value;
        }
        System.out.println("Sum of row " + rowIndex + " is: " + rowSum);
    }
}

public class IPE80 {
    public static void main(String[] args) {
        // Write a complete multi-threaded program to meet following requirements:
        // - Read matrix [A] m x n
        // - Create m number of threads
        // - Each thread computes summation of elements of one row, i.e. ith row of the
        // matrix is
        // processed by ith thread. Where 0 <= i< m.
        // - Print the results

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows (m) ");
        int m = sc.nextInt();
        System.out.println("Enter no of cols (n) ");
        int n = sc.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        MatrixSumThread[] thread = new MatrixSumThread[m];
        for (int i = 0; i < m; i++) {
            thread[i] = new MatrixSumThread(matrix[i], i);
            thread[i].start();
        }

        for (int i = 0; i < m; i++) {
            try {
                thread[i].join();
            } catch (InterruptedException e) {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
