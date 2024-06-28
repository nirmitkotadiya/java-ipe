interface Transport {
    void deliver();
}

abstract class Animal {
    // abstract void makeSound();
}

class Tiger extends Animal {

}

class Camel extends Animal implements Transport {
    public void deliver() {
        System.out.println("camel ");
    }
}

class Deer extends Animal {

}

class Donkey extends Animal implements Transport {
    public void deliver() {

        System.out.println("Donkey");
    }
}

public class IPE78 {
    public static void main(String[] args) {
        // The Transport interface declares a deliver() method. The abstract class
        // Animal is the superclass of the Tiger, Camel, Deer and Donkey classes. The
        // Transport interface is implemented by the Camel and Donkey classes. Write a
        // test program that initialize an array of four Animal objects. If the object
        // implements the Transport interface, the deliver() method is invoked.
        Animal[] animal = new Animal[4];
        animal[0] = new Tiger();
        animal[1] = new Camel();
        animal[2] = new Deer();
        animal[3] = new Donkey();

        for (Animal animal2 : animal) {
            if (animal2 instanceof Transport) {
                ((Transport) animal2).deliver();
            }
        }
    }
}
