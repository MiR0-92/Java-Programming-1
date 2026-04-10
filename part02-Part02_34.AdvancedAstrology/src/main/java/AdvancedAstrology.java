
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int index = 0; index < number; index++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int index = 0; index < number; index++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int index = 1; index <= size; index++) {
            printSpaces(size - index);
            printStars(index);
            
            
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int index = 1; index <= height; index++){
            printSpaces(height - index);
            printStars((index*2)-1);
        }
        for (int index = 0; index < 2; index++){
            printSpaces(height-2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
