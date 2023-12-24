package Chapter1;

import java.util.*;

public class ConvertTemp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter temperature in Fahrenheit: ");
		
		if (scanner.hasNextDouble()) {
			double fahrenheit = scanner.nextDouble();
			
			double celsius = (5.0 / 9.0) * (fahrenheit - 32);
			
			System.out.println("Equivalent temperature in Celsius: " + celsius + " degree Celsius");
		} else {
			System.out.println("Invalid input. Please enter a valid temperature.");
		}
		
		scanner.close();
	}

}
