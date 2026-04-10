
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User input for the first number
        System.out.print("First number? ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        
        //User input for the last number

        System.out.print("Last number? ");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        //Result value that will store the end result
        int result = 0;

        //Using for loop to calculate the process
        for (int index = firstNumber; index <= lastNumber; index++) {
            result += index;
        }
        System.out.println("The sum is: " + result);

    }
}
