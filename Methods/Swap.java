public class Swap {
    public static void main(String[] args) {
        int x = 10, y = 20;

        swap(x , y );

        System.out.println("After swap....");
        System.out.println("x = " + x + " y = " + y);
    }

    public static void swap(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;
        
        System.out.println("After swap in method...");
        System.out.println("a = "+ a + "b = " + b);
    }
}
