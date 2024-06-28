class MyException extends Exception {
    MyException(String s) {
        super(s);
    }
}

public class IPE64_66 {
    public static int computing(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        // Write a method for computing xy by doing repetitive multiplication. x and y
        // are of type integer and are to be given as command line arguments. Raise and
        // handle exception(s) for invalid values of x and y. Also define method main.
        // Use finally in above program and explain its usage.
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        try {
            if (x == 0 || y == 0) {
                throw new MyException("0 is not allowed");
            }
        } catch (MyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("run ...");
            System.out.println("multiplication = " + computing(x, y));
        }
    }
}
