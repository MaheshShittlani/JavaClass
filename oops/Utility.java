public class Utility {
    int a;
    public static final float PI = 3.1456;
    public static int min(int x, int y) {
        return x < y ? x : y;
    }

    public static int gcd(int x, int y) {
        int k = 2;
        while(k <= x && k <= y) {
            if(x % k == 0 && y % k == 0) {
                return k;
            }
            k++;
        }

        return 1;
    }

    private boolean isPrime(int n) {
        return false;
    }

    public int test(int x) {
        // return PI + x;
        return a + x;
    }
}


