// SuperClass
class Figure {
    double dimension1;
    double dimension2;

    Figure(double dimension1, double dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    double area() {
        System.out.println("Area method must be overridden in subclass");
        return 0;
    }
}

// subclass
class Rectangle extends Figure {
    Rectangle(double width, double height) {
        super(width, height);
    }

    double area() {
        return dimension1 * dimension2;
    }
}

// subclass
class Triangle extends Figure {
    Triangle(double base, double height) {
        super(base, height);
    }

    double area() {
        return 0.5 * dimension1 * dimension2;
    }
}

public class IPE62 {
    public static void main(String[] args) {
        // Write a JAVA program to create a super class called figure that stores the
        // dimensions of a two dimensional object. It also defines a method called area
        // () that computes the area of an object.
        // The program derives two sub classes from figure. The first is rectangle and
        // the second is Triangle. Each of these subclasses overrides area (), so that
        // it returns the area of a rectangle and a triangle respectively

        // rectangle
        Rectangle r = new Rectangle(5, 10);
        System.out.println("Area of Rectangle : " + r.area());

        // triangle

        Triangle t = new Triangle(5, 10);
        System.out.println("Area of Triangle : " + t.area());
    }

}
