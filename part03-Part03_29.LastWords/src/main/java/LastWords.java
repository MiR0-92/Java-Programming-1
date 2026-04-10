
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //While loop that takes user input until the user enters an empty string
        while(true){
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }
            // Small code that takes the user input and splits it into separate words
            String[] splitText = text.split(" ");
            //Display only the last word of the string
            String lastWord = splitText[splitText.length-1];
            System.out.println(lastWord);
        }

    }
}
