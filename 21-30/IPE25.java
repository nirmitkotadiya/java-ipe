public class IPE25 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // 25 WAP to find Factorial of a number.
        System.out.println(factorial(4));
    }

}
