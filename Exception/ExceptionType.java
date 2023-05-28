import java.io.Console;

class ExceptionType1 {
    public static void main(String[] args) {
        int a , b, c;
        float result;

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);
            result = a / (b - c);
            System.out.println("Result = "+result);
        } catch(NumberFormatException e) {
            System.out.println("Error..."+ e);
        } catch(ArithmeticException e) {
            System.out.println("Error..."+e);
        }


    }
}