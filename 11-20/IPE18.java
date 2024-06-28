public class IPE18 {
    public static void main(String[] args) {
        // 18 WAP for finding sum of 1 to k. The number k should be read from the
        // keyboard using Command line argument.

        int k = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }

}
