package Chapter2;

import java.util.Scanner;

public class GradeReport {

	public static void main(String[] args) {
		int grade, category;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a numeric grade (0 to 100): ");
		grade = scanner.nextInt();
		category = grade / 10;
		System.out.print("That grade is ");
		
		switch(category) {
		case 10: 
			System.out.println("a perfect score. Well done.");
			break;
			
		case 9:
			System.out.println("well above average. Great.");
			break;
		
		case 8:
			System.out.println("above average. Nice job.");
			break;
			
		case 7:
			System.out.println("average.");
			break;
			
		case 6:
			System.out.println("below average.");
			break;
			
		default:
			System.out.println("not passing.");
		}	
		
		scanner.close();
	}

}
