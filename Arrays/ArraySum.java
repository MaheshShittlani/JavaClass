public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println("Array sum "+arraySum(arr));

        System.out.println("1 + 2 + 3 + 4 + 5 + 1: " + arraySum(1,2,3,4,5,1));
    }

    public static int arraySum(int... arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
