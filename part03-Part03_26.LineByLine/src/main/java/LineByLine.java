
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        String text = scanner.nextLine();
        String[] divideString = text.split(" ");
            if (text.equals("")){
                break;
            }

            for (int index =0; index <divideString.length; index++){
                System.out.println(divideString[index]);
            }
        }



    }
}
