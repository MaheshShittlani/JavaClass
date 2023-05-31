import java.math.BigDecimal;
import java.math.RoundingMode;

public class LargeDecimal {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal(1);
        BigDecimal num2 = new BigDecimal(3);
        BigDecimal result = num1.divide(num2, 20, RoundingMode.UP);
        
        System.out.println(result);
    }
}
