import java.io.Console;

class ExceptionType1 {
    public static void main(String[] args) {
        int a , b, c;
        float result;

        Console con = System.console();
        System.out.print("Enter any 3 numbers: ");
        try {
            a = Integer.parseInt(con.readLine());
            b = Integer.parseInt(con.readLine());
            c = Integer.parseInt(con.readLine());
            result = a / (b - c);
            System.out.println("Result = "+result);
        } catch(NumberFormatException e) {
            System.out.println("Error..."+ e);
        } catch(ArithmeticException e) {
            System.out.println("Error..."+e);
        }


    }
}