import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // Test your Film class here

        // Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        // Scanner reader = new Scanner(System.in);

        // System.out.println("How old are you");
        // int age = Integer.valueOf(reader.nextLine());

        // System.out.println();
        // if (age >= chipmunks.ageRating()) {
        //     System.out.println("You may watch the film " + chipmunks.name());
        // } else {
        //     System.out.println("You may not watch the film " + chipmunks.name());
        // }
        Scanner scanner = new Scanner(System.in);
        Film matrix = new Film("The Matrix", 12);

        System.out.println("How old are you?");
        int age = Integer.valueOf(scanner.nextLine());

        System.out.println();
        if (age >= matrix.ageRating()){
            System.out.println("You may watch the film " + matrix.name());
        } else {
            System.out.println("You may not watch the film " + matrix.name());
        }
    }
}
