
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Adding User input
        int inputNumber = Integer.valueOf(scanner.nextLine());
        // Using for loop to achieve this result
        for (int index = inputNumber; index <= 100; index++){
            System.out.println(index);
        }
       // Using While loop
    /* int counter = inputNumber;
    while (counter <= 100){
        System.out.println(counter);
        counter++;
    } */
    }
}
