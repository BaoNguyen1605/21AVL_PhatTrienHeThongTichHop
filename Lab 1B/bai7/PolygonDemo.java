package bai7;

import java.util.Scanner;

public class PolygonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CHƯƠNG TRÌNH TÍNH CHU VI VÀ DIỆN TÍCH ĐA GIÁC ===");
        System.out.println("1. Tam giác thường");
        System.out.println("2. Tam giác cân");
        System.out.println("3. Tam giác đều");
        System.out.println("4. Tứ giác");
        System.out.println("5. Hình chữ nhật");
        System.out.println("6. Hình vuông");
        System.out.println("7. Ngũ giác đều");
        System.out.println("8. Lục giác đều");
        System.out.println("9. Bát giác đều");
        System.out.print("Vui lòng chọn loại hình (1-9): ");

        int chon = sc.nextInt();
        Polygon shape = null;

        switch (chon) {
            case 1:
                System.out.print("Nhập 3 cạnh a, b, c: ");
                shape = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;
            case 2:
                System.out.print("Nhập cạnh bên và cạnh đáy: ");
                shape = new IsoscelesTriangle(sc.nextDouble(), sc.nextDouble());
                break;
            case 3:
                System.out.print("Nhập cạnh tam giác đều: ");
                shape = new EquilateralTriangle(sc.nextDouble());
                break;
            case 4:
                System.out.print("Nhập 4 cạnh a, b, c, d: ");
                shape = new Quadrilateral(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
                break;
            case 5:
                System.out.print("Nhập chiều dài và chiều rộng: ");
                shape = new Rectangle(sc.nextDouble(), sc.nextDouble());
                break;
            case 6:
                System.out.print("Nhập cạnh hình vuông: ");
                shape = new Square(sc.nextDouble());
                break;
            case 7:
                System.out.print("Nhập cạnh ngũ giác đều: ");
                shape = new Pentagon(sc.nextDouble());
                break;
            case 8:
                System.out.print("Nhập cạnh lục giác đều: ");
                shape = new Hexagon(sc.nextDouble());
                break;
            case 9:
                System.out.print("Nhập cạnh bát giác đều: ");
                shape = new Octagon(sc.nextDouble());
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        if (shape != null) {
            System.out.println("\n--- KẾT QUẢ ---");
            System.out.println("Chu vi: " + shape.perimeter());
            System.out.println("Diện tích: " + shape.area());
        }

        sc.close();
    }
}
