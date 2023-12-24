package Chapter1;

import java.util.*;

public class CalorieCalculator {
	
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");

        if (scanner.hasNextDouble()) {
           
            double bodyWeight = scanner.nextDouble();

            // Calculate the number of calories needed
            double calories = bodyWeight * 19;

            System.out.println("You need " + calories + " calories per day.");
        } else {
            
            System.out.println("Invalid input. Please enter a valid number for weight.");
        }
        
        scanner.close();
    }
}
