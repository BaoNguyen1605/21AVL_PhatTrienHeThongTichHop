import java.util.Scanner;
public class bai4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("Số vừa nhập là số chẵn");
        }else{
            System.out.println("Số vừa nhập là số lẻ");
        }
        sc.close();
    }
}
