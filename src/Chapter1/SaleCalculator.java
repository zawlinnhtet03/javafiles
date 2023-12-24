package Chapter1;

import java.util.*;

public class SaleCalculator {
	public static final double COST_PER_POUND = 5.99;
    public static final double SALES_TAX_RATE = 0.0725;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Weight per bag (in pounds): ");
		double unitWeight = scanner.nextDouble();
		
		System.out.print("Number of bags sold: ");
		int numberOfBags = scanner.nextInt();
		
		double totalPrice = unitWeight * numberOfBags *  SALES_TAX_RATE;
	
		// Calculate the sales tax
        double salesTax = totalPrice * SALES_TAX_RATE;
		
		double totalPriceWithTax = totalPrice + salesTax;
		
		System.out.println("Weight per bag: " + unitWeight + " lb");
        System.out.println("Number of bags sold: " + numberOfBags);
        System.out.println("Price per pound: $" + COST_PER_POUND);
        System.out.printf("Sales tax: %.2f%%%n", (SALES_TAX_RATE * 100));
        System.out.printf("Total price: $%.2f", totalPriceWithTax);

        scanner.close();
	}

}
