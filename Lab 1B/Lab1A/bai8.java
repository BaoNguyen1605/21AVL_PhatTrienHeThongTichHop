import java.io.File;

public class bai8 {
    public static void main(String[] args) {
        File f = new File("test_delete.txt");

        try {
            f.createNewFile();
            System.out.println("Đã tạo file test_delete.txt");

            if (f.delete()) {
                System.out.println("Đã xóa file test_delete.txt thành công!");
            } else {
                System.out.println("Xóa file thất bại!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
