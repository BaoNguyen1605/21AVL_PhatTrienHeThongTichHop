package bai2;

public class DemoArray {
    public static void main(String[] args) {
        System.out.println("=== THAO TÁC TRÊN MẢNG SỐ NGUYÊN ===");
        IntArray arr = new IntArray(20);

        arr.themVaoCuoi(45);
        arr.themVaoCuoi(12);
        arr.themVaoCuoi(89);
        arr.themVaoCuoi(23);
        arr.themVaoCuoi(67);
        arr.xuatMang();

        System.out.println("\n--- Thêm phần tử ---");
        arr.themVaoDau(10);
        arr.themVaoCuoi(99);
        arr.themVaoViTri(50, 3);
        arr.xuatMang();

        System.out.println("\n--- Xóa phần tử ---");
        arr.xoaPhanTuGiaTri(12);
        arr.xoaPhanTuTaiViTri(1);
        arr.xuatMang();

        System.out.println("\n--- Tìm kiếm tuyến tính ---");
        int pos1 = arr.timKiemTuyenTinh(50);
        System.out.println("Tìm số 50: " + (pos1 != -1 ? "Thấy tại vị trí " + pos1 : "Không thấy"));

        System.out.println("\n--- Sắp xếp Radix Sort tăng dần ---");
        arr.radixSort(true);
        arr.xuatMang();

        System.out.println("\n--- Tìm kiếm nhị phân ---");
        int pos2 = arr.timKiemNhiPhan(67);
        System.out.println("Tìm số 67: " + (pos2 != -1 ? "Thấy tại vị trí " + pos2 : "Không thấy"));

        System.out.println("\n--- Sắp xếp Radix Sort giảm dần ---");
        arr.radixSort(false);
        arr.xuatMang();
    }
}
