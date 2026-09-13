import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class bai12 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file_nhi_phan.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeInt(100);
            dos.writeDouble(8.5);
            dos.writeUTF("Xin chao Java");

            dos.close();
            fos.close();
            System.out.println("Ghi file nhị phân thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
