package bai7;

public class Hexagon implements Polygon {
    private double canh;

    public Hexagon(double canh) {
        this.canh = canh;
    }

    @Override
    public double perimeter() {
        return 6 * canh;
    }

    @Override
    public double area() {
        return (3 * Math.sqrt(3) / 2) * canh * canh;
    }
}
