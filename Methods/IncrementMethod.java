public class IncrementMethod {
    public static void main(String[] args) {
        int i = 1;
        increment(i);
        System.out.println("After increment in main: "+x);
    }

    public static void increment(int i) {
        i++;
        System.out.println("After increment in method: "+i);
    }
}
