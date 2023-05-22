public class CalcSumOfEachCol {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,1,5},{3,4,1,2}};

        for(int col = 0; col < arr[0].length; col ++ ) {
            int sum = 0;
            for(int row = 0; row < arr.length; row++) {
                sum += arr[row][col];
            }

            System.out.println("Sum of "+ col +" is " + sum);
        }
    }
}
