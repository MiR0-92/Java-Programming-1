
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Asking the user for an input
        System.out.print("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int factorial = 1;

        //for loop to iterate through the factorial calculations
        /* for (int index = 1; index <= number; index ++){
            factorial *= index;
        }
        System.out.print("Factorial: " + factorial); */

        //While Loop implementation
        int index = 1;
        
        while (index <= number){
            factorial = factorial * index;
            index++;
        }
        System.out.print("Factorial: " + factorial);
    }
}
