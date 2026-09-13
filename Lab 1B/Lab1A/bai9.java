import java.io.File;

public class bai9 {
    public static void deleteDir(File f) {
        if (f.isDirectory()) {
            for (File c : f.listFiles()) {
                deleteDir(c);
            }
        }
        f.delete();
    }

    public static void main(String[] args) {
        File folder = new File("folder_de_xoa");
        
        folder.mkdir();
        System.out.println("Đã tạo thư mục folder_de_xoa");

        deleteDir(folder);
        System.out.println("Đã xóa thư mục folder_de_xoa thành công!");
    }
}
