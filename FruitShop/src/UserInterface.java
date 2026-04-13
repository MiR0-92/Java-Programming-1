import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface{
    private Scanner scanner;
    private ArrayList<Fruit> fruits;


    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.fruits = new ArrayList<>();
    }

    public void start() {
        this.fruits.add(new Fruit("Apple", 2));
        this.fruits.add(new Fruit("Banana", 2.5));
        this.fruits.add(new Fruit("Grape", 3.3));
        this.fruits.add(new Fruit("Pineapple", 6.1));
        Format formatter = new DecimalFormat();
        double totalAmount = 0;

        while (true) {
            showProducts();
            String userInput = scanner.nextLine();
            if (userInput.equals("N") || userInput.equals("n")) {
                System.out.println("Total: " + formatter.format((totalAmount)) + "$");
                return;
            }
            for (Fruit fruit : fruits) {
                if (fruit.getName().equals(userInput)) {
                    totalAmount += fruit.getPrice() * addQuantity();
                    break;
                }
            }

            System.out.println("Would you like to continue shopping? (Y/N)\nTotal: " + totalAmount + "$");
        }

    }

    public int addQuantity() {
        System.out.print("Quantity: ");
        int enterQuantity = Integer.valueOf(scanner.nextLine());
        return enterQuantity;
    }

    public void showProducts() {
        
        System.out.print("Available products: ");

        for (Fruit fruit : fruits) {
            if (fruit == fruits.getLast()) {
                System.out.print(fruit);
            } else {
                System.out.print(fruit + ", ");
            }
        }
        System.out.println("\nChoose a product:");
    }
}
