public class GenericBox<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class TestGenericBox {
    public static void main(String[] args) {
        GenericBox<Integer> iobj = new GenericBox<>();
        iobj.setValue(10);

        GenericBox<Double> dobj = new GenericBox<>();
        dobj.setValue(33.45);

        int x = iobj.getValue();
        double y = dobj.getValue();

        System.out.println(x +" "+y);

        // dobj.setValue("Hello"); Compile time error, type safety
    }
}
