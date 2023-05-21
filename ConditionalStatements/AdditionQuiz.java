import java.util.Scanner;
class AdditionQuiz {
	public static void main(String args[]) {
		// Generate two random number
		int number1 = (int)(System.currentTimeMillis() % 10);
		int number2 = (int)(System.currentTimeMillis() / 10 % 10);
		
		// Display Question
		System.out.print("What is "+ number1 +" + " + number2 + "? ");
		
		// Read the answer
		Scanner input  = new Scanner(System.in);
		int answer = input.nextInt();
		
		// Display result
		System.out.print(number1 + " + " + number2 + 
		" = " + (number1 + number2) +" and your result is " + answer);
		
		if(number1 + number2 == answer) {
			System.out.print(" is Correct.");
		}else {
			System.out.print(" is wrong.");
		}
	}
}