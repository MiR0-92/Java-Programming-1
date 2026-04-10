
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int count = 0;
        System.out.print("File? ");
        String file = scanner.nextLine();
    
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
            try (Scanner readFile = new Scanner(Paths.get(file))){

            while (readFile.hasNextLine()) {
                int convertToInt = Integer.valueOf(readFile.nextLine());
                number = convertToInt;
                if (number >= lowerBound && number <= upperBound){
                count++;
            } 
                
            }
            
        } catch (Exception e){
            System.out.println("File doesn't exist" + e.getMessage());
        }
    
        System.out.print("Numbers: " + count);
    }

}
