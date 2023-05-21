import java.util.Scanner;
public class FindGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any two number: ");
        int a = input.nextInt();
        int b = input.nextInt();

        int result = gcd(a,b);

        System.out.println("GCD of "+ a +" and "+ b +" is "+result);
        input.close();
    }

    public static int gcd(int n1, int n2) {
        int k = 2;
        int result = 1;

        while(k <= n1 && k <= n2) {
            if(n1 % k == 0 && n2 % k == 0) {
                result = k;
            }

            k++;
        }
        return result;
    }
}
