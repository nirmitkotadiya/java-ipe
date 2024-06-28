interface P {
    int CONSTANT_P = 1;

    void methodp();

}

interface P1 extends P {
    int CONSTANT_P1 = 2;

    void methodp1();
}

interface P2 extends P {
    int CONSTANT_P2 = 3;

    void methodp2();
}

interface P12 extends P1, P2 {
    int CONSTANT_P12 = 4;

    void methodp12();

}

class Q implements P12 {

    public void methodp1() {
        System.out.println("method p1   = " + CONSTANT_P1);
    }

    @Override
    public void methodp() {
        System.out.println("method p   = " + CONSTANT_P);

    }

    @Override
    public void methodp2() {
        System.out.println("method p2   = " + CONSTANT_P2);

    }

    @Override
    public void methodp12() {
        System.out.println("method p12   = " + CONSTANT_P12);

    }

}

public class IPE77 {

    public static void main(String[] args) {
        // Write a program that illustrates interface inheritance. Interface P is
        // extended by P1 And P2. Interface P12 inherits from both P1 and P2.Each
        // interface declares one constant and one method. Class Q implements
        // P12.Instantiate Q and invokes each of its methods. Each method displays one
        // of the constants.

        Q q = new Q();
        q.methodp();
        q.methodp1();
        q.methodp2();
        q.methodp12();
    }
}
