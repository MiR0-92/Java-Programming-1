public class AmericanFlag {
    public static void main(String[] args) throws Exception {
        printAmericanFlag(9,6);
    }


    public static void printAmericanFlag(int starRows, int stripeRows){
        for (int starRow = 0; starRow < starRows; starRow++) {
            if(starRow % 2 == 0){
                System.out.println( "* * * * * * ==================================");
            } else{
                System.out.println( " * * * * *  ==================================");
            }
        }
        for (int stripeRow = 0; stripeRow < stripeRows; stripeRow++) {
            System.out.println("==============================================");
        }
    }

}
