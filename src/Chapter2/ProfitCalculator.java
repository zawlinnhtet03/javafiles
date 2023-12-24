package Chapter2;

import java.util.*;

public class ProfitCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of item (0 for Clothes, 1 for Shoes): ");
        int itemType = scanner.nextInt();

        System.out.print("Enter the price of the item: $");
        double itemPrice = scanner.nextDouble();

        // Calculate and display the profit based on the type and price
        double profit = calculateProfit(itemType, itemPrice);
        System.out.println("Profit for selling the item: $" + (int) profit);

        scanner.close();
    }

    private static double calculateProfit(int itemType, double itemPrice) {
        double profit;

        // Check item type and calculate profit accordingly
        if (itemType == 0) { // Clothes
            if (itemPrice < 20.00) {
                profit = 0.10 * itemPrice; 
            } else if (itemPrice >= 20.00 && itemPrice <= 50.00) {
                profit = 0.15 * itemPrice; 
            } else {
                profit = 0.20 * itemPrice;
            }
        } else if (itemType == 1) { // Shoes
            if (itemPrice < 5.00 || itemPrice > 30.00) {
                profit = 0.05 * itemPrice; 
            } else {
                profit = 0.10 * itemPrice; 
            }
        } else {
            System.out.println("Invalid item type. Please enter 0 for Clothes or 1 for Shoes.");
            profit = 0.0; 
        }

        return (int) profit;
    }
}
