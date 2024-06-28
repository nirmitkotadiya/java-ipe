class Rectangle {
    double width;
    double height;

    // no -arg
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // arg
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getArea
    public double getArea() {
        return width * height;
    }

    // getPerimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class IPE61 {

    public static void main(String[] args) {

        // 61 Write a class named Rectangle to represent a rectangle. It contains
        // following members: DATA: width(double) and height (Double) that specify the
        // width and height of the rectangle. Methods:
        // 1. A no-arg constructor that creates a default rectangle.
        // 2. A constructor that creates a rectangle with the specified width and
        // height.
        // 3. A method named getArea() that returns the area of this rectangle.
        // 4. A method named getPerimeter() that returns the perimeter.
        Rectangle r = new Rectangle();
        System.out.println("default rectangle");
        System.out.println("Area = " + r.getArea());
        System.out.println("Perimeter = " + r.getPerimeter());
        System.out.println();

        Rectangle cr = new Rectangle(5.0, 10.0);
        System.out.println("custom rectangle");
        System.out.println("Area = " + cr.getArea());
        System.out.println("Perimeter = " + cr.getPerimeter());
    }

}
