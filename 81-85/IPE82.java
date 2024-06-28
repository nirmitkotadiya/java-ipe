class ProCon {
    int data;

    synchronized void produce(int i) {
        data = i;
        System.out.println("Produce = " + data);
    }

    synchronized void consume() {
        System.out.println("consume = " + data);
    }
}

class ProduceConsume extends Thread {
    ProCon p;

    ProduceConsume(ProCon p) {
        this.p = p;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i <= 5; i++) {
            p.produce(i);
            p.consume();
        }
    }
}

public class IPE82 {
    public static void main(String[] args) {
        // Write a complete multi-threaded program to meet following requirements:
        // o Two threads of same type are to be instantiated in the method main.
        // o Each thread acts as a producer as well as a consumer.
        // o A shared buffer can store only one integer information along with the
        // source &
        // destination of the information at a time.
        // o The information produced is to be consumed by appropriate consumer.
        // o Both producers produce information for both consumers.
        // o Each thread produces 5 information

        ProCon p = new ProCon();
        ProduceConsume pc1 = new ProduceConsume(p);
        ProduceConsume pc2 = new ProduceConsume(p);
        pc1.start();
        try {
            pc1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pc2.start();
    }
}
