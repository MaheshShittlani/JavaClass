public class MaxTwoNum {
    public static void main(String[] args) {
        System.out.println("Max<10,23>: "  + max(10,23));
    }
    public static int max(int x, int y) {
        
        if(x > y) {
            return x;
        }
        return y;
    }

}
