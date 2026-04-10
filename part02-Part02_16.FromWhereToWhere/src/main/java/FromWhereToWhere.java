
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Chossing where the user input to start from
        System.out.print("Where to? ");
        int startNumber = Integer.valueOf(scanner.nextLine());

        System.out.print("Where from? ");
        int endingNumber = Integer.valueOf(scanner.nextLine());
        int count = 0;
        for (int index = startNumber; index <= endingNumber; index++) {
            System.out.println(index);
        }
        
    }
}
