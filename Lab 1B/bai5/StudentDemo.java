package bai5;

import bai4.Student;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sinh viên n = ");
        int n = Integer.parseInt(sc.nextLine());

        Student[] ds = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Nhập thông tin sinh viên thứ " + (i + 1) + " ---");
            ds[i] = new Student();
            ds[i].inputInfo(sc);
        }

        System.out.println("\n=== DANH SÁCH TẤT CẢ SINH VIÊN ===");
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh viên " + (i + 1) + ":");
            ds[i].printInfo();
        }

        double maxDiem = ds[0].getDiemTB();
        double minDiem = ds[0].getDiemTB();

        for (int i = 1; i < n; i++) {
            if (ds[i].getDiemTB() > maxDiem) maxDiem = ds[i].getDiemTB();
            if (ds[i].getDiemTB() < minDiem) minDiem = ds[i].getDiemTB();
        }

        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM TB CAO NHẤT (" + maxDiem + ") ===");
        for (int i = 0; i < n; i++) {
            if (ds[i].getDiemTB() == maxDiem) {
                ds[i].printInfo();
            }
        }

        System.out.println("\n=== SINH VIÊN CÓ ĐIỂM TB THẤP NHẤT (" + minDiem + ") ===");
        for (int i = 0; i < n; i++) {
            if (ds[i].getDiemTB() == minDiem) {
                ds[i].printInfo();
            }
        }

        System.out.println("\n=== DANH SÁCH SINH VIÊN ĐẠT HỌC BỔNG ===");
        for (int i = 0; i < n; i++) {
            if (ds[i].isHocBong()) {
                ds[i].printInfo();
            }
        }

        sc.close();
    }
}
