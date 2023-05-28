public class ExceptionType3 {

    public static int compute(int a, int b) {
       return a / b;
    }
    public static void main(String[] args) {
        
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            
            int result  = compute(a, b);
            System.out.println("Result  = " + result);
        } catch(NumberFormatException e) {
            System.out.println(e);
        } catch(ArithmeticException e) {
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Byeeeee.....");
    }
}
