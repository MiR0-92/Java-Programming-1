
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // adding a summation variable which will store all the inputs and sum them
        int sum = 0;

        // While loop to do all the programming.
        while (true) {
            // printing a statement to request number and value that stores the user input
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());

            // Check if user enters 0 to exit the program
            if (number == 0) {
                break;
            }
            //Increment the sum based on the user input and store it.
            sum = sum + number;
        }
        // Printing the total sum of all inputs entered by the user
        System.out.println("Sum of the numbers: " + sum);
    }
}
