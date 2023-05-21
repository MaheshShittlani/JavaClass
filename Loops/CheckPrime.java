import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int n = input.nextInt();
        int i;
        boolean isPrime = true;
        for(i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                //System.out.println(n+" is not a prime number");
                isPrime = false;
                break;
            }
        }

        // if(i == n) {
        //     System.out.println(n+" is prime number");
        // }

        if(isPrime) {
            System.out.println(n+" is a prime number");
        }else {
            System.out.println(n+" is not prime number");
        }
        input.close();
    }
}
