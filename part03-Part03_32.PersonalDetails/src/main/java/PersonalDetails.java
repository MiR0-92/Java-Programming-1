
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longestNumber = 0;
        String longestName = "";
        int sum = 0;
        int count = 0;
        // While loop that takes user inputs until the user enters an empty string
        while (true) {
            String text = scanner.nextLine();
            if (text.equals("")) {
                break;
            }

            // Variable, that splits the string into 2 parts, Name and age. The split will
            // be done by pressing ","
            String[] splitText = text.split(",");
            // Takes the length of the name entered by the user
            int nameLength = Integer.valueOf(splitText[0].length());

            int birthYear = Integer.valueOf(splitText[1]);
            if (longestNumber < nameLength) {
                longestNumber = nameLength;
                longestName = splitText[0];

            }
            sum += birthYear;
            count++;
        }
        System.out.print("Longest name: " + longestName);
        System.out.println("");
        System.out.print("Average of the birth years: " + 1.0 * sum / count);
    }
}
