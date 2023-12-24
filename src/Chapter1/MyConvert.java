package Chapter1;

import java.util.*;

public class MyConvert {
	// Constants for conversion factors
	public static final double CM_TO_INCH = 2.54;
	public static final double INCHES_PER_FOOT = 12.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter length in centimeters: ");
		
		if (scanner.hasNextDouble()) {
			double centimeters = scanner.nextDouble();
			
			// Convert cm to inch
			double inches = centimeters / CM_TO_INCH;
			
			// Convert inches to feet and remaining inches to feet
			int feet = (int) (inches / INCHES_PER_FOOT);
			double remainingInches = inches % INCHES_PER_FOOT;
			
			System.out.println("Converted length: " + feet + " feet and " + remainingInches + " inches");
			
			
		} else {
			
			System.out.println("Invalid input. Please enter a valid number.");
		}
		
		scanner.close();
	}
}
