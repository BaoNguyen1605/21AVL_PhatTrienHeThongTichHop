package bai6;

public class DemoBai6 {
    public static void main(String[] args) {
        ClassC obj = new ClassC();

        System.out.println("--- Trạng thái ban đầu ---");
        System.out.println("x của A = " + obj.getXOfA());
        System.out.println("x của B = " + ((ClassB) obj).x);
        System.out.println("x của C = " + obj.x);

        obj.setXOfA(99);

        System.out.println("\n--- Sau khi gán x của A = 99 trong phương thức của C ---");
        System.out.println("x của A = " + obj.getXOfA());
        System.out.println("x của B = " + ((ClassB) obj).x);
        System.out.println("x của C = " + obj.x);
    }
}
