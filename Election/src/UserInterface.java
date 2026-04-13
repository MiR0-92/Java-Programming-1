import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<Person> people;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.people = new ArrayList<>();
    }

    public void start() {
        showMenu();
        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("-1") || userInput.isEmpty()) {

                for (Person person : people) {
                    if (person.getVotes() >= 1) {
                        System.out.println(person);
                    }
                }
                
                System.out.println("-------------------------");
                System.out.println(printThePersonWithTheMostVotes());
                return;
            }
            this.people.add(new Person(userInput));
            for (Person person : people) {
                if (person.getName().equals(userInput)) {
                    person.increaseVoteCountByOne();
                    break;
                }
            }

        }
    }

    public void showMenu() {
        System.out.println("#######################################");
        System.out.println("# Enter the votes, one vote per line. #");
        System.out.println("# End with either -1 or an empty line.#");
        System.out.println("#######################################");
        System.out.println();
    }

    public String printThePersonWithTheMostVotes() {

        Person personWithTheMostVotes = people.get(0);
        for (Person person : people) {
            if (personWithTheMostVotes.getVotes() < person.getVotes()) {
                personWithTheMostVotes = person;
            }
        }

        return "The winner is " + personWithTheMostVotes.getName() + " with " + personWithTheMostVotes.getVotes()
                + " votes";
    }
}
