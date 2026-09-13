class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuong;

    public SanPham() {
    }
    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        setDonGia(donGia);
        setSoLuong(soLuong);
    }
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        if (donGia < 0) {
            System.out.println("Canh bao: Don gia khong duoc am. Tu dong gan bang 0.");
            this.donGia = 0;
        } else {
            this.donGia = donGia;
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong < 0) {
            System.out.println("Canh bao: So luong khong duoc am. Tu dong gan bang 0.");
            this.soLuong = 0;
        } else {
            this.soLuong = soLuong;
        }
    }

    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    public void nhapHang(int soLuongNhap) {
        if (soLuongNhap <= 0) {
            System.out.println("[LOI] So luong nhap phai lon hon 0!");
            return;
        }
        this.soLuong += soLuongNhap;
        System.out.println("[THANHCONG] Da nhap them " + soLuongNhap + " " + tenSP + " vao kho.");
    }

    public boolean banHang(int soLuongBan) {
        if (soLuongBan <= 0) {
            System.out.println("[LOI] So luong ban phai lon hon 0!");
            return false;
        }
        if (soLuongBan > this.soLuong) {
            System.out.println("[LOI] Khong du hang trong kho (Ton: " + this.soLuong + ", Can ban: " + soLuongBan + ")");
            return false;
        }

        this.soLuong -= soLuongBan;
        System.out.println("[THANHCONG] Da ban " + soLuongBan + " " + tenSP);
        return true;
    }

    public void hienThiThongTin() {
        System.out.printf("| %-8s | %-20s | %,12.0f VNĐ | %-8d | %,15.0f VNĐ |%n",
                maSP, tenSP, donGia, soLuong, tinhThanhTien());
    }
}

public class bai1 {
    public static void main(String[] args) {
        System.out.println("=========================================================================");
        System.out.println("                       QUAN LY SAN PHAM CUA HANG");
        System.out.println("=========================================================================");

        SanPham sp1 = new SanPham("SP01", "Laptop Dell XPS 15", 35000000, 10);
        SanPham sp2 = new SanPham("SP02", "Chuot Logitech MX", 2200000, 5);

        System.out.println("\n--- TRANG THAI BAN DAU ---");
        inHeaderBang();
        sp1.hienThiThongTin();
        sp2.hienThiThongTin();
        inFooterBang();

        System.out.println("\n>>> THAO TAC 1: Nhap them hang cho SP02 (Chuot Logitech MX)");
        sp2.nhapHang(15);
        System.out.println("-> Cap nhat thong tin SP02:");
        inHeaderBang();
        sp2.hienThiThongTin();
        inFooterBang();

        System.out.println("\n>>> THAO TAC 2: Ban 4 san pham SP01 (Laptop Dell XPS 15)");
        boolean banThanhCong = sp1.banHang(4);
        System.out.println("Ket qua giao dich: " + (banThanhCong ? "Thanh cong" : "That bai"));
        System.out.println("-> Cap nhat thong tin SP01:");
        inHeaderBang();
        sp1.hienThiThongTin();
        inFooterBang();

        System.out.println("\n>>> THAO TAC 3: Ban 20 san pham SP01 (So luong ton kho hien tai: " + sp1.getSoLuong() + ")");
        boolean banThatBai = sp1.banHang(20);
        System.out.println("Ket qua giao dich: " + (banThatBai ? "Thanh cong" : "That bai"));
        System.out.println("-> Cap nhat thong tin SP01 (ton kho giu nguyen):");
        inHeaderBang();
        sp1.hienThiThongTin();
        inFooterBang();
    }

    private static void inHeaderBang() {
        System.out.println("+----------+----------------------+------------------+----------+-----------------+");
        System.out.println("| Ma SP    | Ten san pham         | Don gia          | So luong | Thanh tien      |");
        System.out.println("+----------+----------------------+------------------+----------+-----------------+");
    }

    private static void inFooterBang() {
        System.out.println("+----------+----------------------+------------------+----------+-----------------+");
    }
}
