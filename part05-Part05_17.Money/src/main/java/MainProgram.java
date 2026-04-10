
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(2,  50);
        Money b = new Money(2, 0);
        Money c = a.minus(b);
        System.out.println(c);

    }
}
