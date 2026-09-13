package bai1;

public class DemoHinh {

    public static void main(String[] args) {
        System.out.println("=== 1. KHỞI TẠO KHÔNG THAM SỐ VÀ SET GIÁ TRỊ ===");
        HCN hcn1 = new HCN();
        hcn1.setChieuDai(6.0);
        hcn1.setChieuRong(3.0);
        hcn1.xuatThongTin();

        HVuong hv1 = new HVuong();
        hv1.setCanh(3.0);
        hv1.xuatThongTin();

        HTG htg1 = new HTG();
        htg1.setA(3.0);
        htg1.setB(4.0);
        htg1.setC(5.0);
        htg1.xuatThongTin();

        System.out.println("\n=== 2. KHỞI TẠO ĐẦY ĐỦ THAM SỐ ===");
        HCN hcn2 = new HCN(6.0, 3.0);
        hcn2.xuatThongTin();

        HVuong hv2 = new HVuong(3.0);
        hv2.xuatThongTin();

        HTG htg2 = new HTG(3.0, 4.0, 5.0);
        htg2.xuatThongTin();
    }
}
