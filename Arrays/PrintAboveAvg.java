public class PrintAboveAvg {
    public static void main(String[] args) {
        int[] arr = new int[10];

        int sum = 0;
        System.out.println("Array elements are...");
        // Initialize with random values
        for(int i = 0; i < 10; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
            sum += arr[i];
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // Find the avg
        float avg = (float)sum / arr.length;

        System.out.println("Average = "+avg);
        // print above avg

        for(int i = 0; i < arr.length ; i++) {
            if(arr[i] > avg) {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
