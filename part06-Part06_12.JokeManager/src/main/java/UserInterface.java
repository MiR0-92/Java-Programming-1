import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private JokeManager jokeManager;

    public UserInterface() {
        this.jokeManager = new JokeManager();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printJokeManagerOptions();

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            if (command.equals("1")) {
                addJoke();
                continue;

            } else if (command.equals("2")) {
                drawRandomJoke();
                continue;
            } else if (command.equals("3")) {
                this.jokeManager.printJokes();
                continue;
            }
        }
    }

    public void printJokeManagerOptions() {
        System.out.println("Commands:");
        System.out.println(" 1 - add a joke");
        System.out.println(" 2 - draw a joke");
        System.out.println(" 3 - list jokes");
        System.out.println(" X - stop");
    }

    public void addJoke() {
        System.out.println("Write the joke to be added:");
        String joke = scanner.nextLine();
        this.jokeManager.addJoke(joke);
    }

    public void drawRandomJoke() {
        System.out.println("Drawing a joke:");
        System.out.println(this.jokeManager.drawJoke());
    }
}
