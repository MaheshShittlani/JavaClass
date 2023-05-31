import java.math.BigInteger;

public class LargeFact {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        BigInteger result = BigInteger.ONE;

        for(int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i+""));
        }

        System.out.println("Factorial of " +n+ " = "+ result );
    }
}