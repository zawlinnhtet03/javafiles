package Chapter3;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int sum = 0; 
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			sum += number;
			System.out.println("Enter a number");
			number = scanner.nextInt();
		} while (number >= 0);
		
		System.out.println("Sum = " + sum);
		
		scanner.close();
	}

}
