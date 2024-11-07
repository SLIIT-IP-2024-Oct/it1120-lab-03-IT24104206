import java.util.Scanner;

public class IT24104206Lab3Q1B {

    public static void main(String[] args) {
        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Take the user to enter the price of 1kg of rice
        System.out.println("Enter the price of 1kg of rice: ");
        double pricePerKg = input.nextDouble();

        // Take the user to enter the number of kilograms they want to buy
        System.out.println("Enter the number of kilograms of rice you want to buy: ");
        double kilograms = input.nextDouble();

        // Calculate the total amount before the discount
        double totalAmount = pricePerKg * kilograms;

        // Calculate the discount (10% of the total amount)
        double discount = totalAmount * 0.10;

        // Calculate the final amount after the discount
        double amountAfterDiscount = totalAmount - discount;

        // Display the results
        System.out.println("Total amount before discount: " + totalAmount);
        System.out.println("Discount (10%): " + discount);
        System.out.println("Total amount after discount: " + amountAfterDiscount);

        // Close the scanner
        input.close();
    }
}