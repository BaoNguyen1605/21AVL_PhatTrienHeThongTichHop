import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số A: ");
        int A = sc.nextInt();
        System.out.print("Nhập số B: ");
        int B = sc.nextInt();
        System.out.println("Tổng của A và B là: " + (A + B));
        sc.close();
    }
}
