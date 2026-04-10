
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int inputCount = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == 0){
                break;
            }

            if (number > 0) {
                sumOfNumbers += number;
                inputCount += 1;
            }
        }
        double average = 1.0 * sumOfNumbers / inputCount;
        if (average > 0){
            System.out.println(average);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
