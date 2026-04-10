
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //making an input counter
        int inputCount = 0;

        //a loop to create the program

        while (true){
            //printing statement
            System.out.println("Give a number:");
            // variable that prompts the user to input a number
            int number = Integer.valueOf(scanner.nextLine());
            // check if user press 0, if he does, program exits
            if (number == 0){
                break;
            }
            //check if user inputs negative number, add it to the counter
            if (number < 0){
                inputCount += 1;
            }

        }
        //printing a statement with total negative numbers.
        System.out.println("Number of negative numbers: " + inputCount);
    }
}
