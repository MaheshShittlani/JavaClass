public class ExceptionType2 {
    public static void main(String[] args) {
        
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            
            int result  = a / b;
            System.out.println("Result  = " + result);
        } catch(NumberFormatException e) {
            System.out.println(e);
        } catch(ArithmeticException e) {
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("Byeeeee.....");
    }
}
