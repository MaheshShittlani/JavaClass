import java.util.Scanner;
public class ShowTime {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the time in seconds: ");
		int totalSeconds = input.nextInt();
		
		int minutes = totalSeconds / 60;
		int seconds = totalSeconds % 60;
		
		System.out.println(totalSeconds+" is " + 
		minutes + " minutes and " + seconds + " seconds");
	}
}