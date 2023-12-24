package Chapter2;

import java.util.*;

public class YourAge {

	public static void main(String[] args) {
		final int MINOR = 21;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		System.out.println("You entered: " + age);
		if (age < MINOR) {
			System.out.println("Youth is a wonderful thing. " + "Enjoy!");
		}
		System.out.println("Age is a state of mind.");
		
		scanner.close();
	}

}
