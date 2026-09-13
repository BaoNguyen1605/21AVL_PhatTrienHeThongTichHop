package bai7;

public class Octagon implements Polygon {
    private double canh;

    public Octagon(double canh) {
        this.canh = canh;
    }

    @Override
    public double perimeter() {
        return 8 * canh;
    }

    @Override
    public double area() {
        return 2 * (1 + Math.sqrt(2)) * canh * canh;
    }
}
