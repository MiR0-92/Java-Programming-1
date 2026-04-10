
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        // Part 3: Extending the program by adding number counter
        int userInputCount = 0;
        // Part 1: Give numbers implementation

        // Part 5: Extending the program by counting even and odd numbers.
        int evenCounter = 0;
        int oddCounter = 0;

        System.out.println("Give numbers:");

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            // If even or odd count it

            if (number % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

            sum += number;
            // Part 2: Extending the program by adding summation to the user input
            userInputCount++;
        }
        // Part 4: Extending the program by adding average calculation

        double average = 1.0 * sum / userInputCount;
        
        // Printing all calculations

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + userInputCount);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);

    }
}
