class TotalAverage {
    int total;
    int arr[];
    int average;

    public TotalAverage(int a, int b, int c, int d, int e) {
        arr = new int[] { a, b, c, d, e };
        calculateTotalandAverage(arr);
    }

    public void calculateTotalandAverage(int arr[]) {
        total = 0;
        for (int i : arr) {
            total += i;
        }
        average = total / arr.length;
    }
}

public class IPE60 {
    public static void main(String[] args) {
        // Write a java program to calculate total and average to five values. Pass
        // input values as constructor
        // parameter.
        TotalAverage ta = new TotalAverage(10, 20, 30, 40, 50);
        System.out.println("Total = " + ta.total);
        System.out.println("Average = " + ta.average);
    }
}
