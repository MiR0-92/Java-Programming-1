
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Which file should have its contents printed?");
        String text = input.nextLine();

        try(Scanner getFile = new Scanner(Paths.get(text))){

            while (getFile.hasNextLine()) {

                String nextLine = getFile.nextLine();
                System.out.println(nextLine);
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
