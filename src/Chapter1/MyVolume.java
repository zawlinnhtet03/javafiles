package Chapter1;

import java.util.*;

public class MyVolume {
	public static final double PI = 3.14;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the radius of the sphere: ");
		
		if (scanner.hasNextDouble()) {
			double radius = scanner.nextDouble();
			
			double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
		
			System.out.println("The computed Volume: " + volume + " V");
			
		} else {
			System.out.println("Invalid input. Please enter a valid number for the radius.");
		}
		
		scanner.close();
	}

}
