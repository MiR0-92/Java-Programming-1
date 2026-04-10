
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Adding 3 variables One for summation, one for counting the user inputs and one for average
        int sumOfNumbers = 0;
        int numOfInputs = 0;

        while (true) {
            //Printing a message and requesting a user input
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //Checking if the user presses 0 - exit the program
            if (number == 0) {
                break;
            }
            //Storing the summation and number of steps into the variables above
            sumOfNumbers += number;
            numOfInputs += 1;
        }
        //printing the average of the all user inputs
        System.out.println("Average of the numbers: " + (1.0 * sumOfNumbers / numOfInputs));
    }
}
