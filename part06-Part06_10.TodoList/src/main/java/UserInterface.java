import java.util.Scanner;

public class UserInterface {
    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {

            System.out.print("Command: ");
            String userInput = this.scanner.nextLine();
            if (userInput.equals("stop")) {
                break;
            } else if (userInput.equals("add")) {
                add();
            } else if (userInput.equals("list")) {
                list.print();
            } else if (userInput.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.print("To add:");
        String task = this.scanner.nextLine();
        list.add(task);
    }

    public void remove() {
        System.out.print("Which one is removed?");
        int removeTask = Integer.valueOf(scanner.nextLine());
        list.remove(removeTask);
    }

}
