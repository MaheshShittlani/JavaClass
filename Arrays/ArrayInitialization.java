class ArrayIntialization {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};

        //Accessing array valures
        System.out.println(arr[0] + " " + arr[1] +" " + arr[2]);

        // Accessing using loop
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] b = new int[10];

        // Initialize array with random value from 1 to 10;
        for(int i = 0; i < b.length; i++) {
            b[i] = (int)(Math.random() * 10) + 1;
        }
     }
}