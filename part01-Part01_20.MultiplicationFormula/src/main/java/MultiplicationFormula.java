
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Give the second number:");
        int num2 = scanner.nextInt();
        int sum = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + sum);

    }
}
