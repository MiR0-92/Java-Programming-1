import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Bird> birds;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.birds = new ArrayList<>();
    }

    public void start() {

        while (true) {
            System.out.print("? ");
            String userInput = scanner.nextLine();

            switch (userInput) {
                case "Add":
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Name in Latin: ");
                    String latinName = scanner.nextLine();

                    this.birds.add(new Bird(name, latinName));
                    break;
                case "All":
                    for (Bird bird : birds) {
                        System.out.println(bird);
                    }
                    break;
                case "One":
                    System.out.print("Bird? ");
                    String enterName = scanner.nextLine();
                    System.out.println(getSelectedBird(enterName));
                    break;
                case "Quit":
                    return;
                case "Observation":
                    System.out.print("Bird? ");
                    String check = scanner.nextLine();
                    if (isBird(check)){
                        getSelectedBird(check).markedAsSeen();
                    } else {
                        System.out.println("Not a Bird!");
                    }
                break;
                default:
                    System.out.println("The command you've entered is invalid!\nTry again.");
                    break;
            }
        }
    }

    public Bird getSelectedBird(String name) {
        for (Bird bird : birds) {
            String birdName = bird.getName();
            String latinName = bird.getLatinName();
            if (birdName.contains(name) || latinName.contains(name)) {
                return bird;
            }
        }
        return null;
    }

    public boolean isBird(String name) {
        if (this.birds.contains(getSelectedBird(name))) {
            return true;
        }
        return false;
    }
}
