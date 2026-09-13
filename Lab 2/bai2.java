class Nguoi {
    private String hoTen;
    private int namSinh;
    private String diaChi;

    public Nguoi(String hoTen, int namSinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int tinhTuoi() {
        return 2026 - namSinh;
    }

    public void hienThiThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh + " (Tuoi: " + tinhTuoi() + ")");
        System.out.println("Dia chi: " + diaChi);
    }
}

class SinhVien extends Nguoi {
    private String maSinhVien;
    private String nganhHoc;
    private double diemTrungBinh;

    public SinhVien(String hoTen, int namSinh, String diaChi, String maSinhVien, String nganhHoc, double diemTrungBinh) {
        super(hoTen, namSinh, diaChi);
        this.maSinhVien = maSinhVien;
        this.nganhHoc = nganhHoc;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String xepLoai() {
        if (diemTrungBinh >= 8.5) {
            return "Gioi";
        } else if (diemTrungBinh >= 7.0) {
            return "Kha";
        } else if (diemTrungBinh >= 5.0) {
            return "Trung binh";
        } else {
            return "Yeu";
        }
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Nganh hoc: " + nganhHoc);
        System.out.println("Diem trung binh: " + diemTrungBinh);
        System.out.println("Xep loai: " + xepLoai());
    }
}

class GiangVien extends Nguoi {
    private String maGiangVien;
    private String chuyenMon;
    private double luongCoBan;
    private double heSoLuong;

    public GiangVien(String hoTen, int namSinh, String diaChi, String maGiangVien, String chuyenMon, double luongCoBan, double heSoLuong) {
        super(hoTen, namSinh, diaChi);
        this.maGiangVien = maGiangVien;
        this.chuyenMon = chuyenMon;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Ma giang vien: " + maGiangVien);
        System.out.println("Chuyen mon: " + chuyenMon);
        System.out.println("Luong co ban: " + (long) luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Tong luong: " + (long) tinhLuong());
    }
}

public class bai2 {
    public static void main(String[] args) {
        // Tao 2 sinh vien
        SinhVien sv1 = new SinhVien("Nguyen Van A", 2004, "Ha Noi", "SV01", "CNTT", 8.8);
        SinhVien sv2 = new SinhVien("Tran Thi B", 2005, "Nam Dinh", "SV02", "KHMT", 6.5);

        // Tao 2 giang vien
        GiangVien gv1 = new GiangVien("Le Van C", 1985, "Da Nang", "GV01", "Lap trinh Java", 5000000, 3.5);
        GiangVien gv2 = new GiangVien("Pham Thi D", 1990, "TP HCM", "GV02", "Co so du lieu", 4500000, 4.0);

        // Hien thi thong tin sinh vien
        System.out.println("=== THONG TIN SINH VIEN ===");
        sv1.hienThiThongTin();
        System.out.println("--------------------");
        sv2.hienThiThongTin();
        System.out.println("--------------------");

        // Hien thi thong tin giang vien
        System.out.println("\n=== THONG TIN GIANG VIEN ===");
        gv1.hienThiThongTin();
        System.out.println("--------------------");
        gv2.hienThiThongTin();
        System.out.println("--------------------");
    }
}
