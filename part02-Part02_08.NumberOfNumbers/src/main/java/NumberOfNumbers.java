
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //adding a counter
        int inputCount = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            //checks if program exits here:
            if (number == 0){
                break;
            } 
            
            inputCount += 1;
            
        }
        //displaying the total numbers inputed
        System.out.println("Number of numbers: " + inputCount);
    }
}
