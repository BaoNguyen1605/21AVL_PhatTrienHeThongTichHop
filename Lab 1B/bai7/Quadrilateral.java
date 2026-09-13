package bai7;

public class Quadrilateral implements Polygon {
    protected double a, b, c, d;

    public Quadrilateral(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double perimeter() {
        return a + b + c + d;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt((p - a) * (p - b) * (p - c) * (p - d));
    }
}
