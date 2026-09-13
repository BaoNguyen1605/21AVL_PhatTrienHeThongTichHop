package bai7;

public class Pentagon implements Polygon {
    private double canh;

    public Pentagon(double canh) {
        this.canh = canh;
    }

    @Override
    public double perimeter() {
        return 5 * canh;
    }

    @Override
    public double area() {
        return 0.25 * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * canh * canh;
    }
}
