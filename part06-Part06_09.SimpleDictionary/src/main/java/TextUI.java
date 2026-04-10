import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String enterCommand = scanner.nextLine();

            if (enterCommand.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (enterCommand.equals("add")) {
                addToDictionary();
                continue;
            }

            if (enterCommand.equals("search")) {
                searchInDictionary();
                continue;
            }
            System.out.println("Unknown command");
        }

    }

    public void addToDictionary() {
        System.out.print("Word: ");
        String enterWord = scanner.nextLine();

        System.out.print("Translation: ");
        String translateWord = scanner.nextLine();

        dictionary.add(enterWord, translateWord);

    }

    public void searchInDictionary() {
        System.out.print("To be translated: ");
        String translatedWord = scanner.nextLine();
        System.out.println("Translation: " + dictionary.translate(translatedWord));
    }
}
