
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try (Scanner readFromFile = new Scanner(Paths.get(file, args))) {
            while (readFromFile.hasNextLine()) {
                String lines = readFromFile.nextLine();

                String[] splitLines = lines.split(",");
                String name = splitLines[0];
                int age = Integer.valueOf(splitLines[1]);
                if (age == 1) {
                    System.out.println(name + ", " + "age: " + age + " year");

                } else {
                    System.out.println(name + ", " + "age: " + age + " years");

                }
            }

        } catch (Exception e) {
            System.out.println("File " + file + " might be empty or doesn't exist.");
        }
    }
}
