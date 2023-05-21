import java.util.Scanner;
public class MaxArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();

        // Create array
        int[] arr = new int[n];

        //input array
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        System.out.println("Enter "+ n +" items...");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
            if(arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Max = "+max);
        System.out.println("MaxIndex = "+maxIndex);


        input.close();
    }
}
