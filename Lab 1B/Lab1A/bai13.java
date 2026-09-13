import java.io.DataInputStream;
import java.io.FileInputStream;

public class bai13 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("file_nhi_phan.bin");
            DataInputStream dis = new DataInputStream(fis);

            int n = dis.readInt();
            double d = dis.readDouble();
            String str = dis.readUTF();

            dis.close();
            fis.close();

            System.out.println("Kết quả đọc file nhị phân:");
            System.out.println("Số nguyên: " + n);
            System.out.println("Số thực: " + d);
            System.out.println("Chuỗi: " + str);
        } catch (Exception e) {
            System.out.println("Lỗi đọc file (chú ý chạy bai12 trước để ghi file): " + e.getMessage());
        }
    }
}
