import java.util.Scanner;

public class IPE37 {
    public static void main(String[] args) {
        // WAP to accept array of N integers and find Largest odd number as well as
        // largest even number and display
        // them.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number length");
        int numLen = sc.nextInt();
        int numbers[] = new int[numLen];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = sc.nextInt();
        }
        int evenMax = Integer.MIN_VALUE;
        int oddMax = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i % 2 == 0) {
                if (i > evenMax) {
                    evenMax = i;
                }
            } else if (i % 2 == 1) {
                if (i > oddMax) {
                    oddMax = i;
                }
            }

        }
        System.out.println("evenMax = " + evenMax);
        System.out.println("oddMax = " + oddMax);

        sc.close();
    }

}
