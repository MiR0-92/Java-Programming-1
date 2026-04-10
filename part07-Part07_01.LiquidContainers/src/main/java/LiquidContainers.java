
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;
        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] inputSplit = input.split(" ");
            String word = inputSplit[0];
            int liters = Integer.valueOf(inputSplit[1]);

            if (word.equals("add")) {
                
                if (liters >= 100) {
                    firstContainer = 100;
                } else if (liters < 0) {
                    liters = 0;
                    firstContainer += liters;
                } else {
                    firstContainer += liters;
                }
                if (firstContainer >= 100) {
                    firstContainer = 100;
                }
            }

            if (word.equals("move")) {

                if (firstContainer > 0 && firstContainer > liters){
                    firstContainer -= liters;
                    secondContainer += liters;
                } else {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                }
                
                if (firstContainer < 0){
                    liters = 0;
                }
                if (secondContainer > 100){
                    secondContainer = 100;
                }
            }
            
            if (word.equals("remove")){
                
                if (liters > 0 && secondContainer <= 0){
                    secondContainer = 0;
                } else{
                    secondContainer -= liters;
                }
            }

        }

    }
}
