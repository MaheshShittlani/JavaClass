import java.util.Scanner;

public class RepeatAdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        
        
        // User input
        int count = 0;
        int answer;
        do
        {
            System.out.print("What is "+ num1 +" + "+ num2 +"? ");
            answer = input.nextInt();

            count = count + 1;
        } while(num1 + num2 != answer);   
        
        System.out.println("Your answer is correct. Attempt taken "+count);
    }
}