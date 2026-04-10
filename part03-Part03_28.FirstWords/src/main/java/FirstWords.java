
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Small while loop that takes user input, until the user enters an empty string
        while(true){
            String text = scanner.nextLine();
            if(text.equals("")){
                break;
            }

            //Program that splits the whole text into words and prints only the first word
            //Small array that will store the user text and it will split it into words if the user leaves an interval
            String[] splitText = text.split(" ");
            System.out.println(splitText[0]);
        }

    }
}
