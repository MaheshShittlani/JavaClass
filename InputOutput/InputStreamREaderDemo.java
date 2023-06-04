import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamREaderDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter roll number: ");
        int roll = Integer.parseInt(input.readLine());
        System.out.print("Enter your name: ");
        String name = input.readLine();

        System.out.println(roll + " " + name);
    }
}
