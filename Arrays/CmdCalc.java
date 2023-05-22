public class CmdCalc {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("Error: Usage param1 operator param2, Ex: 44 + 22.");
            System.exit(1);
        }

        int param1 = Integer.parseInt(args[0]);
        int param2 = Integer.parseInt(args[2]);
        String operator = args[1];

        switch (operator) {
            case "+":
                System.out.println(param1 + " " + operator + " " +  param2 + " = " + (param1 + param2));
                break;
            case "-":
                System.out.println(param1 + " " + operator + " " +  param2 + " = " + (param1 - param2));
                break;
            case "*":
                System.out.println(param1 + " " + operator + " " +  param2 + " = " + (param1 * param2));
                break;
            case "/":
                System.out.println(param1 + " " + operator + " " +  param2 + " = " + (param1 / param2));
                break;
            case "%":
                System.out.println(param1 + " " + operator + " " +  param2 + " = " + (param1 % param2));
                break;
        }
    }
}
