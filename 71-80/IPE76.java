abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract String toString();
}

class Potato extends Vegetable {

    public Potato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "potato color is " + getColor();
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Brinjal color is " + getColor();
    }
}

class Tomato extends Vegetable {
    String color;

    public Tomato(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Tomato color is " + getColor();
    }
}

public class IPE76 {
    public static void main(String[] args) {
        // The abstract Vegetable class has three subclasses named Potato, Brinjal and
        // Tomato. Write an application that demonstrates how to establish this class
        // hierarchy. Declare one instance variable of type String that indicates the
        // color of a vegetable. Create and display instances of these objects. Override
        // the toString() method of Object to return a string with the name of the
        // vegetable and its color.
        Vegetable potato = new Potato("brown");
        Vegetable brinjal = new Brinjal("purple");
        Vegetable tomato = new Tomato("red");
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
