
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        //try to read the file
        try(Scanner scanner = new Scanner(Paths.get("data.txt"))){
            //While there are lines in the file, keep reading
            while (scanner.hasNextLine()) {
                //read the next line
                String row = scanner.nextLine();
                //print out the line you just read
                System.out.println(row);
            }
            //if something inside file is corrupted, throw an error of Exception class 
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
