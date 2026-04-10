import java.util.Scanner;

public class Commands {
    private Scanner scanner;

    public Commands(Scanner scanner) {
        this.scanner = scanner;
    }

    public void add() {
        System.out.print("Word: ");
        String enterWord = scanner.nextLine();

        System.out.print("Translation: ");
        String translateWord = scanner.nextLine();

    }
}
