
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // making a while loop, that takes users input and stops when the user hit an
        // empty string.
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            // Making a for loop that will split the user strings if they cointain "av"
            String[] split = text.split(" ");
            for (String word : split){
                if(word.contains("av")){
                    System.out.println(word);
                }
            }
        }

    }
}
