public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int item = 3;

        int pos = linearSearch(item,arr);

        if(pos != -1) {
            System.out.println(item+" found at postition "+(pos+1));
        }else {
            System.out.println(item + " not found");
        }
    }

    public static int linearSearch(int item,int...arr) {
        for(int i = 0;  i < arr.length; i++) {
            if(arr[i] == item) {
                return i;
            }
        }

        return -1;
    }
}
