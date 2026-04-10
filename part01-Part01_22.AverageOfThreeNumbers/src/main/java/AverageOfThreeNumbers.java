
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Give the second number:");
        int num2 = scanner.nextInt();
        System.out.println("Give the third number:");
        int num3 = scanner.nextInt();
        double average = 1.0 * (num1 + num2 + num3) / 3;
        System.out.println("The average is " + average);

    }
}
