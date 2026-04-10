
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // asking for input from the user
        int number = Integer.valueOf(scanner.nextLine());
        //While Loop Variant
        
        int index = 0;
        while (index <= number) {
            System.out.println(index);
            index++;
        }
       //For Loop variant
        /* for (int index = 0; index <= number; index ++){
            System.out.println(index);
        } */
    }
}
