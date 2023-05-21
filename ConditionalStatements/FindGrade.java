/**
Per		Grade
----------------
>=85	S
75-85	A
65-75	B
55-65	C
50-55	D
<50		F
**/

import java.util.Scanner;
class FindGrade {
	public static void main(String args[]) {
		int m1, m2, m3;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 subject marks: ");
		int m1 = input.nextInt();
		int m2 = input.nextInt();
		int m3 = input.nextInt();
		
		float per = (m1 + m2 + m3)/3.0f;
		
		char grade;
		if(per >= 85) 				grade = 'S';
		else if(per >= 75) 			grade = 'A';
		else if(per >= 65) 			grade = 'B';
		else if(per >= 55) 			grade = 'C';
		else if(per >= 50) 			grade = 'D';
		else 						grade = 'F';
		
		System.out.println("Per = "+per+"\nGrade = "+grade);
	}
}