class IPE1 {
    // PI * r * r
    public static int areaCircle(int radius) {
        float PI = 3.14f;
        return (int) PI * radius * radius;
    }

    // l * w
    public static int areaRectangle(int l, int w) {
        return l + w;
    }

    // 2*(l+w)
    public static int perimeterRect(int l, int w) {
        return 2 * (l + w);
    }

    // (1/2)*b*h
    public static float areaTriangle(int b, int h) {
        return (0.5f * b * h);
    }

    public static void main(String[] args) {
        // WAP to calculate the Area of a Circle, Area and Perimeter of rectangle, Area
        // of Triangle
        System.out.println(areaCircle(5));
        System.out.println(areaRectangle(2, 3));
        System.out.println(perimeterRect(2, 3));
        System.out.println(areaTriangle(5, 3));
    }
}