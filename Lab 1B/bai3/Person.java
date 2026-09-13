package bai3;

import java.util.Scanner;

public class Person {
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;

    public Person() {
        this.ten = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
    }

    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void inputInfo(Scanner sc) {
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();
        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void printInfo() {
        System.out.println("Tên: " + ten + ", Giới tính: " + gioiTinh 
                + ", Ngày sinh: " + ngaySinh + ", Địa chỉ: " + diaChi);
    }
}
