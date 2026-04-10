
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner getFile = new Scanner(Paths.get(file))){
            while (getFile.hasNextLine()){
                list.add(getFile.nextLine());
            }
        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;
        for (String name : list){
            if(name.contains(searchedFor)){
                System.out.println("Found!");
                isFound = true;
            } 
        }
        if (!isFound){
            System.out.println("Not found.");
        }
    }
}
