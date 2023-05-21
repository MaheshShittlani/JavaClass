public class RangeSum {
    public static void main(String[] args) {
        // sum 1 to 10;
        int result = sumRange(1,10);
        System.out.println("Total of 1 to 10: "+result);

        // sum 34 to 55
        System.out.println("Sum of 34 to 55: "+sumRange(34, 55));
        
        // sum 10 to 100;
        System.out.println("Sum(10:100): "+sumRange(10, 100));
    }

    public static int sumRange(int start, int end) {
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }

       return sum;
    }
}