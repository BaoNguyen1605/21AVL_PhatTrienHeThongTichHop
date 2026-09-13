package bai7;

public class Rectangle extends Quadrilateral {
    private double dai;
    private double rong;

    public Rectangle(double dai, double rong) {
        super(dai, rong, dai, rong);
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public double perimeter() {
        return 2 * (dai + rong);
    }

    @Override
    public double area() {
        return dai * rong;
    }
}
