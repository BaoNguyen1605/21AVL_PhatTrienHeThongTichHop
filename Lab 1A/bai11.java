import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class bai11 {
    public static void main(String[] args) {
        try {
            File src = new File("source.txt");
            if (!src.exists()) {
                FileOutputStream fos = new FileOutputStream(src);
                fos.write("Hello Java Copy File".getBytes());
                fos.close();
            }

            FileInputStream fis = new FileInputStream("source.txt");
            FileOutputStream fos = new FileOutputStream("copy_source.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }

            fis.close();
            fos.close();

            System.out.println("Đã copy từ source.txt sang copy_source.txt thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
