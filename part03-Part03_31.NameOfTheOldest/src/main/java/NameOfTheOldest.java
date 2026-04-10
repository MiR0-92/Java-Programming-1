
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String oldestName = "";
        while(true){
            String text = scanner.nextLine();
            if (text.equals("")){
                break;
            }
            String[] splitText = text.split(",");
            int age = Integer.valueOf(splitText[1]);

            if (oldest < age){
                oldest = age;
                oldestName = splitText[0];
            }

        }
        System.out.print("Name of the oldest: " + oldestName);
            
    }

}
