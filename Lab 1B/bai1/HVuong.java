package bai1;

public class HVuong {
    private double canh;

    public HVuong() {
        this.canh = 0;
    }

    public HVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public double getChuVi() {
        return canh * 4;
    }

    public double getDienTich() {
        return canh * canh;
    }

    public void xuatThongTin() {
        System.out.println("HÌNH VUÔNG [Cạnh: " + canh 
                + " | Chu vi: " + getChuVi() + ", Diện tích: " + getDienTich() + "]");
    }
}
