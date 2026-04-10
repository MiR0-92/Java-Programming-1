
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last number? ");
        int inputNumber = Integer.valueOf(scanner.nextLine());
        int result = 0;
        /* for (int index = 1; index <= inputNumber; index++){
        result = result + index;
        } */

        //While loop Solution
        int index = 1;
        while (index <= inputNumber){
            result += index;
            index++;
        }
        System.out.print("The sum is " + result);
    }
}
