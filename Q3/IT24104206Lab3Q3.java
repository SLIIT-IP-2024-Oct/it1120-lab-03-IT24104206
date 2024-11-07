import java.util.Scanner;

public class IT24104206Lab3Q3 {

    public static void main(String[] args) {
        // Create an objects called input to scanner class
        Scanner input = new Scanner(System.in);
        
        // Ask the user to input the amount
        System.out.print("Enter the amount in rupees: ");
        int amount = input.nextInt();
        
        // Denominations available in rupees
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Loop through each denomination and calculate the number of notes/coins
        for (int denomination : denominations) {
            // Calculate how many notes of the current denomination can fit into the remaining amount
            int count = amount / denomination;
            
            // Update the amount by subtracting the value of the notes/coins used
            amount = amount % denomination;
            
            // Print the number of notes/coins for this denomination
            System.out.println(denomination + " Notes - " + count);
        }
        
        // Close the scanner to prevent resource leak
        input.close();
    }
}