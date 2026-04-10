
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {

            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] inputSplit = input.split(" ");
            String text = inputSplit[0];
            int liters = Integer.valueOf(inputSplit[1]);

            if (text.equals("add")) {
                first.add(liters);
            }

            if (text.equals("move")) {
                if (liters > first.contains()){
                    liters = first.contains();
                }
                first.remove(liters);
                second.add(liters);
            }

            if (text.equals("remove")) {
                second.remove(liters);
            }

        }
    }

}
