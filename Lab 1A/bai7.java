import java.io.File;

public class bai7 {
    public static void main(String[] args) {
        File f = new File("test.txt");
        File dir = new File("my_folder");

        try {
            if (dir.mkdir()) {
                System.out.println("Đã tạo thư mục: " + dir.getName());
            }

            if (f.createNewFile()) {
                System.out.println("Đã tạo file: " + f.getName());
            }

            System.out.println("File có tồn tại không? " + f.exists());
            System.out.println("Tên file: " + f.getName());
            System.out.println("Đường dẫn tuyệt đối: " + f.getAbsolutePath());
            System.out.println("Kích thước file: " + f.length() + " bytes");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
