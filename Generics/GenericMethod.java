public class GenericMethod {
    public static void main(String[] args) {
        Integer[] arr = {22,55,11,77,88};
        String[] cities  = {"London","Berlin","Mosco","Tokyo"};

        GenericMethod.<Integer>print(arr);
        GenericMethod.<String>print(cities);
    }

    public static <E> void print(E[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
