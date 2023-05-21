public class ArrayReverese {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        arrayReverse(arr);

        System.out.println("After reverse array items aree...");
        
        display(arr);
    }

    public static void arrayReverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        int t;
        while(i < j) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
