public class MultiplicationTables {
    public static void main(String[] args) {
        // Print Header
        System.out.println("      1   2   3   4   5   6   7   8   9  10");
        System.out.println("-------------------------------------------------");

        for(int i = 1; i <=10; i++)
        {
            System.out.printf("%3d | ",i);
            for(int j = 1; j <= 10; j++) {
                System.out.printf("%-4d",i * j);
            }
            System.out.println();
        }
    }
}