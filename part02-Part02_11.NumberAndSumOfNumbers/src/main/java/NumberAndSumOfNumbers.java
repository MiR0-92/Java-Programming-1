
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declaring 2 variables 1 to store the addition of all user inputs and another to store the total count for the inputs.
        int sumOfNumbers = 0;
        int inputCount = 0;

        while (true) {
            //printing a message and requesting user input
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //exiting the program when the user inserts 0
            if (number == 0){
                break;
            }
            //taking the user input and store it into the variables for count and addition
            sumOfNumbers += number;
            inputCount += 1;
        }
        //printing both the sum and the total count of the inputs
        System.out.println("Number of numbers: " + inputCount);
        System.out.println("Sum of the numbers: " + sumOfNumbers);

    }
}
