package bai6;

public class ClassC extends ClassB {
    public int x = 30;

    public void setXOfA(int value) {
        ((ClassA) this).x = value;
    }

    public int getXOfA() {
        return ((ClassA) this).x;
    }
}
