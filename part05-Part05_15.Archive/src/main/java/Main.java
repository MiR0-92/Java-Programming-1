
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archive = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String idInput = scanner.nextLine();
            if (idInput.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();

            if (nameInput.isEmpty()) {
                break;
            }
            Archive product = new Archive(idInput, nameInput);
/*             if (archive.contains(product)){
                continue;
            } */
            archive.add(product);
            
        }
        ArrayList<String> printedIDs = new ArrayList<>();
        System.out.println("==Items==");
        for (Archive item : archive){
            if (printedIDs.contains(item.getId())){
                continue;
            }
            printedIDs.add(item.getId());
            System.out.println(item);
        }

        scanner.close();
    }

}
