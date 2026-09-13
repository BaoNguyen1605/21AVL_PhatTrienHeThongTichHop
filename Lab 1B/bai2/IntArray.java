package bai2;

import java.util.Scanner;

public class IntArray {
    private int[] a;
    private int n;
    private int maxN;

    public IntArray() {
        this.maxN = 100;
        this.a = new int[maxN];
        this.n = 0;
    }

    public IntArray(int maxN) {
        this.maxN = maxN;
        this.a = new int[maxN];
        this.n = 0;
    }

    public void nhapMang(Scanner sc) {
        System.out.print("Nhập số phần tử n (n <= " + maxN + "): ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }
    }

    public void xuatMang() {
        System.out.print("Mảng: [ ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("]");
    }

    public void themVaoDau(int Y) {
        themVaoViTri(Y, 0);
    }

    public void themVaoCuoi(int Y) {
        themVaoViTri(Y, n);
    }

    public void themVaoViTri(int Y, int i) {
        if (n >= maxN || i < 0 || i > n) {
            System.out.println("Vị trí chèn " + i + " không hợp lệ!");
            return;
        }
        for (int k = n; k > i; k--) {
            a[k] = a[k - 1];
        }
        a[i] = Y;
        n++;
    }

    public void xoaPhanTuGiaTri(int X) {
        int pos = timKiemTuyenTinh(X);
        if (pos != -1) {
            xoaPhanTuTaiViTri(pos);
        } else {
            System.out.println("Không tìm thấy giá trị " + X + " để xóa.");
        }
    }

    public void xoaPhanTuTaiViTri(int j) {
        if (j < 0 || j >= n) {
            System.out.println("Vị trí xóa " + j + " không hợp lệ!");
            return;
        }
        for (int k = j; k < n - 1; k++) {
            a[k] = a[k + 1];
        }
        n--;
    }

    public int timKiemTuyenTinh(int B) {
        for (int i = 0; i < n; i++) {
            if (a[i] == B) {
                return i;
            }
        }
        return -1;
    }

    public int timKiemNhiPhan(int B) {
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == B) {
                return mid;
            }
            if (a[mid] < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public void radixSort(boolean tangDan) {
        if (n <= 1) return;

        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }

        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] output = new int[n];
            int[] count = new int[10];

            for (int i = 0; i < n; i++) {
                int digit = (a[i] / exp) % 10;
                count[digit]++;
            }

            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            for (int i = n - 1; i >= 0; i--) {
                int digit = (a[i] / exp) % 10;
                output[count[digit] - 1] = a[i];
                count[digit]--;
            }

            for (int i = 0; i < n; i++) {
                a[i] = output[i];
            }
        }

        if (!tangDan) {
            for (int i = 0; i < n / 2; i++) {
                int temp = a[i];
                a[i] = a[n - 1 - i];
                a[n - 1 - i] = temp;
            }
        }
    }
}
