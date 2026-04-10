
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //While loop that takes user input, until user enters an empty string
        int oldest = 0;
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            //Small array that will split the user input when he types ","
            String[] splitText = userInput.split(",");
            //Converting the text after "," into int
            
            int age = Integer.valueOf(splitText[splitText.length -1]);
                if (oldest < age){
                    oldest = age;
                }
            
        }
        System.out.print("Age of the oldest: " + oldest);


    }
}
