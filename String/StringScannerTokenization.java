import java.util.Scanner;

public class StringScannerTokenization {
    public static void main(String[] args) {
        Scanner  input = new Scanner("Arun Sharma 25");

        // while(input.hasNext()) {
        //     System.out.println(input.next());
        // }

        String firstName = input.next();
        String lastName = input.next();
        int age = input.nextInt();

        System.out.println(firstName + " , "+ lastName + ", "+age);
        input.close();
    }
}
