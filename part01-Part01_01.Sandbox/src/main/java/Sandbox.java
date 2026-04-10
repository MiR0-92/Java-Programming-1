import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;



public class Sandbox {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        int randomNumber = random.nextInt(9,101);
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        numbers.add(random.nextInt(0,100));
        System.out.println(randomNumber);
        System.out.println(numbers);
        System.out.println(numbers.get(random.nextInt(0,numbers.size())));
    }

}
