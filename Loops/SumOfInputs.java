import java.util.Scanner;

public class SumOfInputs {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int num;

        int sum = 0;
        while(true)
        {
            System.out.print("Enter any number (Press 0 to exit): ");
            num = input.nextInt();
            if(num == 0) {
                break;
            }

            sum += num;
        } 


        System.out.println("Total = "+sum);
        input.close();
    }
}   
