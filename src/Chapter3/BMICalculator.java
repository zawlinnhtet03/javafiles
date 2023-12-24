package Chapter3;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in centimeters: ");
        double height = scanner.nextDouble();

        // Calculate BMI using the formula
        double bmi = calculateBMI(weight, height);

        System.out.println("BMI: " + bmi);

        scanner.close();
    }

    // Method to calculate BMI
    private static double calculateBMI(double weight, double height) {
        // Convert height to meters (divide by 100)
        double heightInMeters = height / 100.0;

        // Calculate BMI using the formula
        return weight / (heightInMeters * heightInMeters);
    }
}

