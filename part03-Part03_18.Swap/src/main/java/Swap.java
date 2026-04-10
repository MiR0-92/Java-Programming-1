
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        System.out.println("Give two indices to swap:");
        int firstIndex =Integer.valueOf(scanner.nextLine());
        int secondIndex =Integer.valueOf(scanner.nextLine());
        System.out.println("");
        // and then swapping them
        int temporaryStorage = array[firstIndex];
        for(int indexInArray = 0; indexInArray < array.length; indexInArray++){
            if (array[indexInArray] == temporaryStorage){
                temporaryStorage = array[indexInArray];
                array[indexInArray] = array[secondIndex];
                array[secondIndex] = temporaryStorage;
            }
            System.out.println(array[indexInArray]);
        }

    }

}
