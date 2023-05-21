public class ArrayShuffle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        for(int i = 0; i < arr.length; i++) {
            int j = (int)(Math.random() * arr.length);

            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        System.out.println("Items are...");
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
