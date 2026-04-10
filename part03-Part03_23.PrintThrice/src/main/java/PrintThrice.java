
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        System.out.println("");
        System.out.println(trice(word));

    }
    public static String trice(String text){
        return text + text + text;
    }
}
