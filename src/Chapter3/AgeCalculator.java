package Chapter3;

import java.util.Scanner;
import java.time.Year;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year you were born: ");
        int birthYear = scanner.nextInt();

        // Get the current year
        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;
        System.out.println("You were born in " + birthYear + " and will be (are) " + age + " in this year.");

        scanner.close();
    }
}

