
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int valueOfGift = Integer.valueOf(scan.nextLine());

        if (valueOfGift > 1000000){
            double taxReturn = (142100 + (valueOfGift - 1000000) * 0.17);
            System.out.println("Tax: " + taxReturn);
        } else if (valueOfGift >= 200000 && valueOfGift < 1000000){
            double taxReturn = (22100 + (valueOfGift - 200000) * 0.15);
            System.out.println("Tax: " + taxReturn);
        } else if (valueOfGift >= 55000 && valueOfGift < 200000){
            double taxReturn = (4700 + (valueOfGift - 55000) * 0.12);
            System.out.println("Tax: " + taxReturn);
        } else if (valueOfGift >= 25000 && valueOfGift < 55000){
            double taxReturn = (1700 + (valueOfGift - 25000) * 0.10);
            System.out.println("Tax: " + taxReturn);
        } else if (valueOfGift >= 5000 && valueOfGift < 25000){
            double taxReturn = (100 + (valueOfGift - 5000) * 0.08);
            System.out.println("Tax: " + taxReturn);
        } else {
            System.out.println("No Tax!");
        }
    }
}
