
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> numbers = new ArrayList<>();
        
        while (true){
            int enterNumber = Integer.valueOf(scanner.nextLine());
            if(enterNumber == -1){
                break;
            }
            numbers.add(enterNumber);
        }
        int sum = 0;
        // Then it computes the average of the numbers on the list
        // and prints it.
        for (int number: numbers){
            sum += number;
        }
        double average = 1.0 * sum / numbers.size();
        System.out.print("Average: " + average);
        
    }
}
