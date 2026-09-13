package bai3_4_5;

import java.util.Scanner;

public class Student extends Person {
    private double diemTB;
    private String email;

    public Student() {
        super();
        this.diemTB = 0;
        this.email = "";
    }

    public Student(String ten, String gioiTinh, String ngaySinh, String diaChi, double diemTB, String email) {
        super(ten, gioiTinh, ngaySinh, diaChi);
        this.diemTB = diemTB;
        this.email = email;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isHocBong() {
        return diemTB > 8.0;
    }

    @Override
    public void inputInfo(Scanner sc) {
        super.inputInfo(sc);

        do {
            System.out.print("Nhập điểm trung bình (0.0 - 10.0): ");
            diemTB = Double.parseDouble(sc.nextLine());
            if (diemTB < 0 || diemTB > 10) {
                System.out.println("Điểm không hợp lệ! Vui lòng nhập lại.");
            }
        } while (diemTB < 0 || diemTB > 10);

        do {
            System.out.print("Nhập email: ");
            email = sc.nextLine();
            if (!email.contains("@") || email.contains(" ")) {
                System.out.println("Email phải chứa '@' và không có khoảng trắng! Vui lòng nhập lại.");
            }
        } while (!email.contains("@") || email.contains(" "));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("-> ĐTB: " + diemTB + ", Email: " + email 
                + ", Học bổng: " + (isHocBong() ? "CÓ" : "KHÔNG"));
    }
}
