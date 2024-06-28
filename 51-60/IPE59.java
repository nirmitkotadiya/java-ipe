import java.util.Scanner;

public class IPE59 {
    public static void main(String[] args) {
        // Write a program that creates an integer array and then uses a for loop to
        // check whether the array is sorted
        // from smallest to largest. If so, it prints “sorted” otherwise it prints “Not
        // sorted”
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = sc.nextInt();

        int numbers[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter value of arr[" + i + "]");
            numbers[i] = sc.nextInt();
        }

        // check smallest to largest
        boolean isChecked = true;
        for (int i = 0; i < num - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                isChecked = false;
                return;
            }
        }
        if (isChecked) {
            System.out.println("Sorted");
        } else {
            System.out.println("Not Sorted");

        }
        sc.close();
    }
}
