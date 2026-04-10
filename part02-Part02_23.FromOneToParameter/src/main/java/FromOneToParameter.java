

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(2);
    }

    public static void printUntilNumber(int number){
        int inputDisplay = 1;
        while (inputDisplay <= number){
            System.out.println(inputDisplay);
            inputDisplay++;
        }
        
    }

}
