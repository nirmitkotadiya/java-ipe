class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class IPE68 {
    public static void main(String[] args) {
        // Write a complete program to accept N integer numbers from the command line.
        // Raise and handle exceptions for following cases:
        // - when a number is –ve
        // - when a number is evenly divisible by 10
        // - when a number is greater than 1000 and less than 2000
        // - when a number is greater than 7000
        // Skip the number if an exception is raised for it, otherwise add it to find
        // total sum
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            try {
                if (num < 0) {
                    throw new MyException("Number is negative");
                }
                if (num % 10 == 0) {
                    throw new MyException("number is divisible by 10");
                }
                if (num > 1000 && num < 2000) {
                    throw new MyException("Number is greater than 1000 and less than 2000");
                }
                if (num > 7000) {
                    throw new MyException("number is greater than 7000.");
                }
                // no exception
                sum += num;
            } catch (MyException e) {
                System.out.println(e);
            }
        }
        System.out.println("sum = " + sum);
    }

}
