class GoodMorning implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Good Morning!" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Afternoon implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Good AfterNoon!" + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class IPE81 {
    public static void main(String[] args) {

        // Write an application that executes two threads. One thread displays "Good
        // Morning" every 1000 milliseconds & another thread displays "Good Afternoon"
        // every 3000 milliseconds. Create the threads by implementing the Runnable
        // interface.

        GoodMorning m = new GoodMorning();
        Afternoon a = new Afternoon();

        Thread t1 = new Thread(m);
        Thread t2 = new Thread(a);

        t1.start();
        t2.start();

    }

}
