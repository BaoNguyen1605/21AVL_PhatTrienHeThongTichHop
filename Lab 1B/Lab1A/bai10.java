import java.io.File;

public class bai10 {
    public static void searchFile(File dir, String fileName) {
        File[] list = dir.listFiles();
        if (list != null) {
            for (File f : list) {
                if (f.isDirectory()) {
                    searchFile(f, fileName);
                } else if (f.getName().equalsIgnoreCase(fileName)) {
                    System.out.println("Tìm thấy file tại: " + f.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) {
        File folder = new File(".");
        String fileToFind = "bai1.java";

        System.out.println("Đang tìm kiếm file '" + fileToFind + "'...");
        searchFile(folder, fileToFind);
    }
}
