import java.util.Scanner;
public class ComputeAreaWithRadiusCheck {
	public static void main(String args[]) {
		// Create Scanner object
		Scanner input = new Scanner(System.in);
		// Read the radius
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		
		// Compute Area
		if(radius > 0) {
			double area = 3.14159 * radius * radius;
			// Display the result
			System.out.print("Area of Circle: " + area);
		}else {
			System.out.print("Invalid Radius!!!");
		}
	}
}