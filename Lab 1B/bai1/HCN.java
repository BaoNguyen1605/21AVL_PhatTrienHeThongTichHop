package bai1;

public class HCN {
    private double chieuDai;
    private double chieuRong;

    public HCN() {
        this.chieuDai = 0;
        this.chieuRong = 0;
    }

    public HCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public double getDienTich() {
        return chieuDai * chieuRong;
    }

    public void xuatThongTin() {
        System.out.println("HCN [Dài: " + chieuDai + ", Rộng: " + chieuRong 
                + " | Chu vi: " + getChuVi() + ", Diện tích: " + getDienTich() + "]");
    }
}
