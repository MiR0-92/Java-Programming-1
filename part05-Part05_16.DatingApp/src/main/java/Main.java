
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate test = new SimpleDate(30, 12, 2011);
        test.advance();
        System.out.println(test);
        test.advance();
        System.out.println(test);
        SimpleDate test1 = test.afterNumberOfDays(7);
        System.out.println(test1);
        System.out.println(test);
    }
}
