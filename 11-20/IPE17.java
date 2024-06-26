public class IPE17 {
    public static void main(String[] args) {
        // 17 Assume that you want to make the sum of 1 to 100. Give the necessary code
        // to perform the same using (1)
        // For loop (2) While loop (3) Do-while loop

        // for loop
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);

        // while loop
        int sum1 = 0, i = 1;
        while (i <= 100) {
            sum1 += i;
            i++;
        }
        System.out.println("sum1 = " + sum1);

        // do while loop
        int sum2 = 0;
        i = 1;
        do {
            sum2 += i;
            i++;
        } while (i <= 100);
        System.out.println("sum2 = " + sum2);

    }
}
