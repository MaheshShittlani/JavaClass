public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int item = 3;

        int pos = binarySearch(item,arr);

        if(pos != -1) {
            System.out.println(item+" found at postition "+(pos+1));
        }else {
            System.out.println(item + " not found");
        }
    }

    public static int binarySearch(int item, int... arr) {
        int lb = 0, ub = arr.length - 1;
        int mid;
        while(lb <= ub) {
            mid = (lb + ub)/2;

            if(item == arr[mid]) {
                return mid;
            } else if(item > arr[mid]) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        return -1;
    }
}
