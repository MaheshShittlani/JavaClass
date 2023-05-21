import java.util.Scanner;
public class FirstDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any year: ");
        int y = input.nextInt();

        int skipdays = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + 1;
        int theDay = skipdays % 7;
        
        if(theDay == 0) {
            System.out.println("Sunday");
        }
        if(theDay == 1) {
            System.out.println("Monday");
        }
        if(theDay == 2) {
            System.out.println("Tuesday");
        }
        if(theDay == 3) {
            System.out.println("Wednesday");
        }
        if(theDay == 4) {
            System.out.println("Thrusday");
        }
        if(theDay == 5) {
            System.out.println("Friday");
        }
        if(theDay == 6) {
            System.out.println("Saturday");
        }
        input.close();
    }
}
