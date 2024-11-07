import java.util.Scanner;

public class IT24104206Lab3Q2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Input: Monthly Salary
        System.out.println("Enter the monthly salary: ");
        double monthlySalary = input.nextDouble();
        
        // Input: Number of OT hours worked
        System.out.print("Enter the number of OT hours worked: ");
        double otHours = input.nextDouble();
        
        // Input: OT Hourly Rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = input.nextDouble();
        
        // Calculate OT Amount
        double otAmount = otHours * otHourlyRate;
        
        // Calculate Total Salary
        double totalSalary = monthlySalary + otAmount;
        
        // Output the display
        System.out.println("The OT Amount is: " + otAmount);
        System.out.println("The Total Salary (including OT) is: " + totalSalary);
        
        // Close the input
        input.close();
    }
}