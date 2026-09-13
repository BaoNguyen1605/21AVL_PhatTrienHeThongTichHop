import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class bai14 {
    public static void main(String[] args) {
        try {
            File imgInput = new File("input.jpg");

            if (!imgInput.exists()) {
                imgInput.createNewFile();
            }

            FileInputStream fis = new FileInputStream(imgInput);
            FileOutputStream fos = new FileOutputStream("output_copy.jpg");

            byte[] b = new byte[1024];
            int length;
            while ((length = fis.read(b)) != -1) {
                fos.write(b, 0, length);
            }

            fis.close();
            fos.close();

            System.out.println("Đã đọc và ghi file ảnh thành công (output_copy.jpg)!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
