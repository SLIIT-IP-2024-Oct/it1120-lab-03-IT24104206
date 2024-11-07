import java.util.Scanner;

public class IT24104206Lab3Q4 {

    public static void main(String[] args) {
        // Create an objects called input to scanner class
        Scanner input = new Scanner(System.in);

        // Prompt the user to input a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();

        // copy and print each digit of the number
        // copy digits by using division and modulus
        int digit1 = (number / 10000) % 10;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        // Print the digits separated by space
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);

        // Close the input
        input.close();
    }
}