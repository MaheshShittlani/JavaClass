public class ArrayReverse2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] result = arrayReverse(arr);

        System.out.println("After reverse array items aree...");
        
        display(result);
    }

    public static int[] arrayReverse(int[] arr) {
        int[] temp = new int[arr.length];
        int i = 0, j = arr.length - 1;

        while(j >= 0) {
            temp[i++] = arr[j--];
        }

        return temp;
    }

    public static void display(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
