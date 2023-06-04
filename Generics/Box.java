public class Box {
    private Object value;

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}

class TestObjectBox {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setValue(10); // Auto boxing

        Box b2 = new Box();
        b2.setValue(33.45);

        int x = (int)b1.getValue();

        double y = (double)b2.getValue();

        b2.setValue("Hello");
        y = (double)b2.getValue();

        System.out.println(x+" "+y);
    }
}