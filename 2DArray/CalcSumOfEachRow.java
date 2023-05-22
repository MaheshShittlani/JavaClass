public class CalcSumOfEachRow {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{2,3,1,5},{3,4,1,2}};

        
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of "+ (i + 1) +" row is "+sum);
        }
    }

    
}