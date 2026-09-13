package bai1;

public class HTG {
    private double a;
    private double b;
    private double c;

    public HTG() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public HTG(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getChuVi() {
        return a + b + c;
    }

    public double getDienTich() {
        double p = getChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void xuatThongTin() {
        System.out.println("TAM GIÁC [a = " + a + ", b = " + b + ", c = " + c 
                + " | Chu vi: " + getChuVi() + ", Diện tích: " + getDienTich() + "]");
    }
}
