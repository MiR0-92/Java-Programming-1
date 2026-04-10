
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);
    }

    public static void divisibleByThreeInRange(int beginning, int end){
        
    /*  for (int index = beginning; index <= end; index++){
            if (index % 3 == 0){
                System.out.println(index);
            }
        } */
        while (beginning <= end){
            if (beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning++;
        }
    }

}
