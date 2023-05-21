public class CheckSign {
    public static void main(String[] args) {
        sign(5);
    }
    public static int sign(int num) {
        if(num > 0) {
            return 1;
        } else if(num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
